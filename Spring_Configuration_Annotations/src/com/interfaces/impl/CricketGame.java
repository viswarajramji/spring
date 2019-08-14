package com.interfaces.impl;

import org.springframework.stereotype.Component;

import com.interfaces.Games;

@Component("cricketGame")
public class CricketGame implements Games {

	@Override
	public String getName() {
		return "Yeahoooo this is cricket";
	}

}
