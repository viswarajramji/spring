package com.app.service;

import com.app.inter.Coach;
import com.app.inter.FortuneService;

public class CricketCoach implements Coach {

	FortuneService fortuneService;

	@Override
	public String get_display() {
		return "Play batting properly";
	}

	@Override
	public String get_Fortune() {
		// TODO Auto-generated method stub
		return fortuneService.get_lucky_Fortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

}
