package com.app.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.inter.Coach;

public class MyApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("baseBall", Coach.class);
		System.out.println(coach.get_display());
		System.out.println(coach.get_Fortune());
		coach = context.getBean("cricket", Coach.class);
		System.out.println(coach.get_display());
		System.out.println(coach.get_Fortune());
		context.close();
	}
}
