package com.spring.ioc.inter.impl;

import com.spring.ioc.inter.Games;

public class Cricket  implements Games{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "cricket";
	}

	@Override
	public String getNoOfPlayer() {
		// TODO Auto-generated method stub
		return "10";
	}

}
