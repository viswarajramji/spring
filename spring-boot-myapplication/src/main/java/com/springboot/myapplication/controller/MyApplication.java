package com.springboot.myapplication.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyApplication {

	@Value("${myapplication.value1}")
	private String test1;

	@Value("${myapplication.value2}")
	private String test2;

	@GetMapping("/")
	public String getFirstPage() {
		return "this is my first spring boot application : " + System.currentTimeMillis();
	}

	@GetMapping("/test1")
	public String getFirstPage1() {
		return test1;
	}

	@GetMapping("/test2")
	public String getFirstPage2() {
		return test2;
	}
}
