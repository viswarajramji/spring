package com.spring.interfaces.impl;

import org.springframework.stereotype.Component;

import com.spring.interfaces.Players;

@Component
public class PlayersImpl implements Players {

	@Override
	public String getName() {
		return "My Name is hello";
	}

}
