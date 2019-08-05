package com.app.service;

import com.app.inter.Coach;

public class BaseBallCoach implements Coach {


	private String emailAddress;

	private String phoneNumber;

	@Override
	public String get_display() {
		return "Jog for 10 kms";
	}

	@Override
	public String getEmailId() {
		return emailAddress;
	}

	@Override
	public String getPhone() {
		return phoneNumber;
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
