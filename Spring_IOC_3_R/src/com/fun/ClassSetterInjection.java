package com.fun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.dependency.ClassInterface;
import com.dependency.Games;

@Component("sInjection")
public class ClassSetterInjection implements ClassInterface {
	
	private Games games;

	@Override
	public String getName() {
		return games.getName();
	}

	public Games getGames() {
		return games;
	}
	
	@Autowired
	@Qualifier("football")
	public void setGames(Games games) {
		this.games = games;
	}

}
