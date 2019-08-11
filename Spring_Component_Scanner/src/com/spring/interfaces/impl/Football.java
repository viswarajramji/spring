package com.spring.interfaces.impl;

import org.springframework.stereotype.Component;

import com.spring.interfaces.Games;

@Component("football")
public class Football implements Games {

	@Override
	public String getName() {
		return "FootBall";
	}

	@Override
	public String getRules() {
		// TODO Auto-generated method stub
		return "Ball and Goals";
	}

}
