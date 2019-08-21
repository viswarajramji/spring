package com.code.springdemo.respository;

import java.util.List;

import com.code.springdemo.entity.Employee;

public interface EmployeeDAO {
	List<Employee> getAllEmployees();

	void save(Employee employee);
}
