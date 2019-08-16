package com.fun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.dependency.ClassInterface;
import com.dependency.Games;

@Component("cInjection")
public class ClassConsInjections implements ClassInterface {
	private Games games;

	@Autowired
	public ClassConsInjections(@Qualifier("football") Games games){
		this.games=games;
	}
	
	@Override
	public String getName() {
		return games.getName();
	}

	public Games getGames() {
		return games;
	}

	public void setGames(Games games) {
		this.games = games;
	}

}
