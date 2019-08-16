package com.fun;

import org.springframework.stereotype.Component;

import com.dependency.Games;

@Component
public class Cricket implements Games {
	@Override
	public String getName() {
		return "Cricket";
	}

}
