package com.spring.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pojo.Student;

@RestController
@RequestMapping("/")
public class MyController {

	@GetMapping("/test")
	public String gethome() {
		return "hello dammer";
	}
	
	
	@GetMapping("/listdata")
	public List<Student> getListData(){
		List<Student> list=new ArrayList<>();
		list.add(new Student(1, "viswa1", "viswaraj93@gmail.com"));
		list.add(new Student(2, "viswa2", "viswaraj93@gmail.com"));
		list.add(new Student(3, "viswa3", "viswaraj93@gmail.com"));
		list.add(new Student(4, "viswa4", "viswaraj93@gmail.com"));
		return list;
	}
}
