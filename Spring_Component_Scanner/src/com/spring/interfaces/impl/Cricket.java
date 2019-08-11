package com.spring.interfaces.impl;

import org.springframework.stereotype.Component;

import com.spring.interfaces.Games;

@Component("cricket")
public class Cricket implements Games {

	@Override
	public String getName() {
		return "Cricket";
	}

	@Override
	public String getRules() {
		// TODO Auto-generated method stub
		return "Balls hitting and running";
	}

}
