package com.interfaces.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.interfaces.Games;

@Component("cricketGame")
public class CricketGame implements Games {

	@Value("${foo.email}")
	String emailId;

	@Value("${foo.name}")
	String name;

	@Override
	public String getName() {
		return "Yeahoooo this is cricket";
	}

	@Override
	public String getEmailId() {
		return emailId;
	}

	@Override
	public String getEmailName() {
		return name;
	}
}
