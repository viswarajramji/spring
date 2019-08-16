package com.fun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.dependency.ClassInterface;
import com.dependency.Games;

@Component("fInjection")
public class ClassFieldInjection implements ClassInterface {
	
	@Autowired
	@Qualifier("cricket")
	private Games games;

	public Games getGames() {
		return games;
	}

	public void setGames(Games games) {
		this.games = games;
	}

	@Override
	public String getName() {
		return games.getName();
	}

}
