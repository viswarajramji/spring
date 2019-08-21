package com.code.springdemo.service;

import java.util.List;

import com.code.springdemo.entity.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();

	void save(Employee emp);
}
