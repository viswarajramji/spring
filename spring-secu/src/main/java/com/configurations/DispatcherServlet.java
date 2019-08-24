package com.configurations;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.controller")
@PropertySource("classpath:persistance.properties")
public class DispatcherServlet {

	@Autowired
	private Environment env;

	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver ir = new InternalResourceViewResolver();
		ir.setPrefix("/WEB-INF/view/");
		ir.setSuffix(".jsp");
		return ir;
	}

	@Bean
	public DataSource securityDataSource() {
		ComboPooledDataSource c3p0 = new ComboPooledDataSource();
		c3p0.setJdbcUrl(env.getProperty("jdbc.url"));
		try {
			c3p0.setDriverClass(env.getProperty("jdbc.driver"));
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c3p0.setUser(env.getProperty("jdbc.user"));
		c3p0.setPassword(env.getProperty("jdbc.password"));

		c3p0.setInitialPoolSize(Integer.parseInt(env.getProperty("connection.pool.initialPoolSize")));
		c3p0.setMinPoolSize(Integer.parseInt(env.getProperty("connection.pool.minPoolSize")));
		c3p0.setMaxPoolSize(Integer.parseInt(env.getProperty("connection.pool.maxPoolSize")));
		c3p0.setMaxIdleTime(Integer.parseInt(env.getProperty("connection.pool.maxIdleTime")));
		return c3p0;
	}
}
