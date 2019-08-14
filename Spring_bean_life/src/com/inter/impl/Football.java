package com.inter.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.inter.Games;

@Component
@Scope("prototype")
public class Football implements Games {
	@Override
	public String getName() {
		return "this game is called a football";
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("Calling Post Construct Method");
	}

	@PreDestroy
	public void preDestory() {
		System.out.println("Pre destroy operation executed");
	}
}
