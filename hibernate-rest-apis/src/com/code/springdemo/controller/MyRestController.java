package com.code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.springdemo.entity.Employee;
import com.code.springdemo.service.EmployeeService;

@RestController
@RequestMapping("/")
public class MyRestController {
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/listdata")
	public List<Employee> getListData() {
		return employeeService.getAllEmployees();
	}

	@RequestMapping("/save")
	public String saveData(@RequestBody Employee employee) {
		employee.setId(0);
		employeeService.save(employee);
		return "saved Successfully";
	}
	
	
	@RequestMapping("/update")
	public String updateData(@RequestBody Employee employee) {
		employeeService.save(employee);
		return "Updated Successfully";
	}
}
