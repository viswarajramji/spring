package com.spring.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.exceptions.StudentNotFoundException;
import com.pojo.StudentErrResponse;

@ControllerAdvice
public class StudentExceptionsError {

	@ExceptionHandler
	public ResponseEntity<StudentErrResponse> studentErrorResponse(StudentNotFoundException exec) {
		StudentErrResponse error = new StudentErrResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(exec.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}

}
