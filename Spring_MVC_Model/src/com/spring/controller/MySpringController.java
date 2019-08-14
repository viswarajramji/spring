package com.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MySpringController {

	@RequestMapping("/")
	public String getHomePage() {
		return "home-ui";
	}

	@RequestMapping("/form")
	public String getFormPage() {
		return "form-ui";
	}

	@RequestMapping("/submit")
	public String getFormSubmit(HttpServletRequest request, Model model) {
		String textbox = request.getParameter("textbox");
		model.addAttribute("message", textbox);
		return "submit-ui";
	}
}
