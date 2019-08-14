package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello2")
public class MySpringController2 {

	@RequestMapping("/")
	public String getHomePage() {
		return "home-ui";
	}

	@RequestMapping("/form")
	public String getFormPage() {
		return "form-ui";
	}

	@RequestMapping("/submit")
	public String getFormSubmitParams(@RequestParam("textbox") String name, Model model) {
		model.addAttribute("message", name);
		return "submit-ui";
	}

}
