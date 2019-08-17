package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.controller")
public class DemoConfig {

//	@Bean
//	public ViewResolver viewResolver() {
//		InternalResourceViewResolver internal = new InternalResourceViewResolver();
//		internal.setPrefix("/WEB-INF/view");
//		internal.setSuffix(".jsp");
//		return internal;
//	}
}
