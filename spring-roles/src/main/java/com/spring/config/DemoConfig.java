package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.spring.controllers")
public class DemoConfig {
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver internal = new InternalResourceViewResolver();
		internal.setPrefix("/WEB-INF/view/");
		internal.setSuffix(".jsp");
		return internal;
	}
}
