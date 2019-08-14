package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.inter.Games;

public class MyApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Application-Context.xml");
		Games games=context.getBean("football",Games.class);
		System.out.println(games.getName());
		context.close();
	}
}
