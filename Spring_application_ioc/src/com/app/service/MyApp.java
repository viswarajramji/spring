package com.app.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("baseBall", Coach.class);
		System.out.println(coach.get_display());
		coach = context.getBean("cricket", Coach.class);
		System.out.println(coach.get_display());
		context.close();
	}
}
