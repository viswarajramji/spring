package com.fun;

import org.springframework.stereotype.Component;

import com.dependency.Games;

@Component
public class Football implements Games {

	@Override
	public String getName() {
		return "Football";
	}

}
