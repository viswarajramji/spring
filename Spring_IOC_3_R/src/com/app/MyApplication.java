package com.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dependency.ClassInterface;

public class MyApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Application-context.xml");
		ClassInterface classInterface=context.getBean("fInjection",ClassInterface.class);
		System.out.println(classInterface.getName());
		classInterface=context.getBean("sInjection",ClassInterface.class);
		System.out.println(classInterface.getName());
		classInterface=context.getBean("cInjection",ClassInterface.class);
		System.out.println(classInterface.getName());
		context.close();
	}
}
