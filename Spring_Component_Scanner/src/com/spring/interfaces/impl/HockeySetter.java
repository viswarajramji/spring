package com.spring.interfaces.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.interfaces.Games;
import com.spring.interfaces.Players;

@Component("hockeySetter")
public class HockeySetter implements Games {

	private Players playerService;

	@Override
	public String getName() {
		return "My Name is viswarajramji";
	}

	@Override
	public String getRules() {
		return "Hit the ball in net";
	}

	@Override
	public String getPlayerName() {
		return playerService.getName();
	}

	public Players getPlayerService() {
		return playerService;
	}

	@Autowired
	public void setPlayerService(Players playerService) {
		this.playerService = playerService;
	}

}
