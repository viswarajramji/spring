package com.interfaces.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.interfaces.Games;

@Component("footBallGame")
public class FootBallGame implements Games {

	@Value("${foo.email}")
	String emailId;

	@Value("${foo.name}")
	String name;

	@Override
	public String getName() {

		return "This is football game";
	}

	@Override
	public String getEmailId() {
		// TODO Auto-generated method stub
		return emailId;
	}

	@Override
	public String getEmailName() {
		// TODO Auto-generated method stub
		return name;
	}

}
