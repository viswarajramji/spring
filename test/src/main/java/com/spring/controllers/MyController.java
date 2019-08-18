package com.spring.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.support.HttpAccessor;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exceptions.StudentNotFoundException;
import com.pojo.Student;
import com.pojo.StudentErrResponse;

@RestController
@RequestMapping("/")
public class MyController {

	List<Student> list = new ArrayList<>();

	@GetMapping("/test")
	public String gethome() {
		list.add(new Student(1, "viswa1", "viswaraj93@gmail.com"));
		list.add(new Student(2, "viswa2", "viswaraj93@gmail.com"));
		list.add(new Student(3, "viswa3", "viswaraj93@gmail.com"));
		list.add(new Student(4, "viswa4", "viswaraj93@gmail.com"));
		return "hello dammer";
	}

	@GetMapping("/listdata")
	public List<Student> getListData() {
		return list;
	}

	@GetMapping("/student/{student_id}")
	public Student getStudent(@PathVariable int student_id) {
		if (list.size() <= student_id) {
			throw new StudentNotFoundException("Overflow exception detected");
		}
		return list.get(student_id);
	}

	@ExceptionHandler
	public ResponseEntity<StudentErrResponse> studentErrorResponse(StudentNotFoundException exec) {
		StudentErrResponse error = new StudentErrResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(exec.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
}
