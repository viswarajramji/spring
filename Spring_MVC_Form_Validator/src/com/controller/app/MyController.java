package com.controller.app;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.controller.pojo.Student;

@Controller
@RequestMapping("/hello")
public class MyController {
	@RequestMapping("/")
	public String showHomePage() {
		return "homepage";
	}

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("student", new Student());
		return "form-ui";
	}

	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student student, Model model,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("student", new Student());
			return "form-ui";
		}
		model.addAttribute("student", student);
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		System.out.println(student.getCountry());
		System.out.println(student.getPhone());
		System.out.println(student.getCompany());
		return "response-ui";
	}

}
