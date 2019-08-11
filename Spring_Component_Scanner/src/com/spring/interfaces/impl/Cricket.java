package com.spring.interfaces.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.spring.interfaces.Games;
import com.spring.interfaces.Players;

@Component("cricket")
public class Cricket implements Games {

	@Autowired
	@Qualifier("playerGuru")
	private Players playerService;

	@Override
	public String getName() {
		return "Cricket";
	}

	@Override
	public String getRules() {
		return "Balls hitting and running";
	}

	@Override
	public String getPlayerName() {
		return playerService.getName();
	}

}
