package com.spring.interfaces.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.interfaces.Games;
import com.spring.interfaces.Players;

@Component("football")
public class Football implements Games {

	@Autowired
	private Players playerService;

	@Override
	public String getName() {
		return "FootBall";
	}

	@Override
	public String getRules() {
		return "Ball and Goals";
	}

	@Override
	public String getPlayerName() {
		return playerService.getName();
	}

}
