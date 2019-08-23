package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping("/")
	public String homePage() {
		return "index";
	}

	@GetMapping("/home")
	public String testHomePage() {
		return "home";
	}

	@GetMapping("/formLogin")
	public String formLogin() {
		return "login";
	}
	
	
}
