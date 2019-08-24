package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyAppl {
	
	@RequestMapping("/")
	public String getView() {
		return "index";
	}

	@RequestMapping("/home")
	public String gethome() {
		return "home";
	}

	@RequestMapping("/showFormLogin")
	public String showForm() {
		return "showForm";
	}

	@RequestMapping("/manager")
	public String manager() {
		return "manager";
	}

	@RequestMapping("/employee")
	public String employee() {
		return "employee";
	}
}
