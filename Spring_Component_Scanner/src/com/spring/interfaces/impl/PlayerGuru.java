package com.spring.interfaces.impl;

import org.springframework.stereotype.Component;

import com.spring.interfaces.Players;

@Component("playerGuru")
public class PlayerGuru  implements Players{

	@Override
	public String getName() {
		return "My name is Guru";
	}

}
