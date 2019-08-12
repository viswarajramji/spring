package com.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.interf.Games;

public class MyApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Application-Context.xml");
		Games game=context.getBean("cricket",Games.class);
		System.out.println(game.getGameName());
		
		Games game1=context.getBean("cricket",Games.class);
		System.out.println(game1.getGameName());
		
		System.out.println(game==game1);
		
		
	}
}
