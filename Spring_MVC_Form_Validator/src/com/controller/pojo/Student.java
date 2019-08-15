package com.controller.pojo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {

	String firstName;

	@NotNull(message = "is required")
	@Size(max =  1)
	String lastName;

	String country;

	String phone;

	String company;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
