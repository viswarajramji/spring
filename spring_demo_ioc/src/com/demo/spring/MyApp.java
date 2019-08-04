package com.demo.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach=context.getBean("baseBall",Coach.class);
		System.out.println(coach.getDisplayName());
		coach=context.getBean("cricketBall",Coach.class);
		System.out.println(coach.getDisplayName());
		context.close();
	}
}
