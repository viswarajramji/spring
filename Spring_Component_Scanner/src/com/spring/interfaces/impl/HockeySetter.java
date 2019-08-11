package com.spring.interfaces.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.interfaces.Games;
import com.spring.interfaces.Players;

@Component("hockeySetter")
public class HockeySetter implements Games {

	private Players playerServiceSetter;

	private Players playerServiceMethod;

	@Override
	public String getName() {
		return playerServiceSetter.getName();
	}

	@Override
	public String getRules() {
		return "Hit the ball in net";
	}

	@Override
	public String getPlayerName() {
		return playerServiceMethod.getName();
	}

	@Autowired
	public void doSome(Players playerService) {
		this.playerServiceMethod = playerService;
	}

	@Autowired
	public void setPlayerService(Players playerService) {
		this.playerServiceSetter = playerService;
	}

}
