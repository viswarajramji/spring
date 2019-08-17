package com.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping("/")
	public String getRequest() {
		return "home";
	}

	@GetMapping("/showLogin")
	public String showLogin() {
		return "showlogin";
	}

	@GetMapping("/admin")
	public String showAdmin() {
		return "admin";
	}

	@GetMapping("/manager")
	public String showManager() {
		return "admin";
	}

	@GetMapping("/notAuthorized")
	public String notAuthorized() {
		return "access_deined";
	}

}
