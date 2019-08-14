package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormHandler {

	@RequestMapping("/")
	public String ShowPage() {
		return "main-ui";
	}
	
	
	@RequestMapping("/form")
	public String showForm() {
		return "form-ui";
	}
	
	@RequestMapping("/submit")
	public String processForm() {
		return "response-ui";
	}
}
