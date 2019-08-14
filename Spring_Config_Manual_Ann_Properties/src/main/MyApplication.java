package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.interfaces.Games;

import annotations.SportConfig;

public class MyApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		Games game = context.getBean("getCricket", Games.class);
		System.out.println(game.getName());
		System.out.println(game.getEmailName());
		System.out.println(game.getEmailId());
		game = context.getBean("getFootBall", Games.class);
		System.out.println(game.getName());
		System.out.println(game.getEmailName());
		System.out.println(game.getEmailId());
		context.close();
	}
}
