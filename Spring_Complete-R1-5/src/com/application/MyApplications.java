package com.application;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codes.Games;

public class MyApplications {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Games game = context.getBean("games", Games.class);
		System.out.println(game.getNames());
		context.close();
	}
}
