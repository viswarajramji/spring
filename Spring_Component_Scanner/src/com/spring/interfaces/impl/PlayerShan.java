package com.spring.interfaces.impl;

import org.springframework.stereotype.Component;

import com.spring.interfaces.Players;

@Component("playerShan")
public class PlayerShan implements Players {

	@Override
	public String getName() {
		return "My name is shan";
	}

}
