package com.interf.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.interf.Games;

@Component
//@Scope("prototype")
public class Cricket implements Games {

	@Override
	public String getGameName() {
		return "Cricket";
	}

}
