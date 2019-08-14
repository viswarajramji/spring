package com.interfaces.impl;

import org.springframework.stereotype.Component;

import com.interfaces.Games;

@Component("footBallGame")
public class FootBallGame implements Games {

	@Override
	public String getName() {

		return "This is football game";
	}

}
