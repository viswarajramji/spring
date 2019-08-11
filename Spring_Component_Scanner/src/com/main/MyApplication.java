package com.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.interfaces.Games;

public class MyApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Application-Context.xml");
		Games game = context.getBean("cricket", Games.class);
		System.out.println(game.getName());
		System.out.println(game.getRules());
		game = context.getBean("football", Games.class);
		System.out.println(game.getName());
		System.out.println(game.getRules());
	}
}