package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.interfaces.Games;

import annotations.SportConfig;

public class MyApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		Games game = context.getBean("cricketGame", Games.class);
		System.out.println(game.getName());
		game = context.getBean("footBallGame", Games.class);
		System.out.println(game.getName());
		context.close();
	}
}
