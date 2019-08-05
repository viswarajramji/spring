package com.app.service;

import com.app.inter.Coach;
import com.app.inter.FortuneService;

public class BaseBallCoach implements Coach {

	FortuneService fortuneService;

	private String emailAddress;

	private String phoneNumber;

	@Override
	public String get_display() {
		return "Jog for 10 kms";
	}

	@Override
	public String get_Fortune() {
		return fortuneService.get_lucky_Fortune();
	}

	@Override
	public String getEmailId() {
		return emailAddress;
	}

	@Override
	public String getPhone() {
		return phoneNumber;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

}
