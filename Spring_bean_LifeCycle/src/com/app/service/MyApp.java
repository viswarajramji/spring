package com.app.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.inter.Coach;

public class MyApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach1 = context.getBean("baseBall", Coach.class);
		Coach coach2 = context.getBean("baseBall", Coach.class);
		//default context type will return single ton class
		//bean life cycle is restricted and can work properly with Singleton class
		System.out.println(coach1==coach2);
		context.close();
		
	}
}
