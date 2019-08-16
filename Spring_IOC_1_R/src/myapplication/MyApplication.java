package myapplication;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.ioc.inter.Games;

public class MyApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Application-context.xml");
		Games game=context.getBean("cricket",Games.class);
		System.out.println(game.getName());
		System.out.println(game.getNoOfPlayer());
		game=context.getBean("football",Games.class);
		System.out.println(game.getName());
		System.out.println(game.getNoOfPlayer());
		context.close();
	}
}
