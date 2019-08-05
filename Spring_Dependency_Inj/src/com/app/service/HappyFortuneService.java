package com.app.service;

import com.app.inter.Coach;
import com.app.inter.FortuneService;

public class HappyFortuneService implements FortuneService {

	@Override
	public String get_lucky_Fortune() {
		return "Today is my lucky day";
	}

}
