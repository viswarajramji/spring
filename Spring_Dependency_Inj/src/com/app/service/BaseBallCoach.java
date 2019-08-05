package com.app.service;

import com.app.inter.Coach;
import com.app.inter.FortuneService;

public class BaseBallCoach implements Coach {

	FortuneService fortuneService;

	BaseBallCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String get_display() {
		return "Jog for 10 kms";
	}

	@Override
	public String get_Fortune() {
		// TODO Auto-generated method stub
		return fortuneService.get_lucky_Fortune();
	}

}
