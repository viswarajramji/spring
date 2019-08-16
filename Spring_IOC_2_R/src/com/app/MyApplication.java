package com.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fun.ClassB;

public class MyApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Application-context.xml");
		ClassB b=context.getBean("B",ClassB.class);
		System.out.println(b.getFirstName());
		context.close();
	}
}
