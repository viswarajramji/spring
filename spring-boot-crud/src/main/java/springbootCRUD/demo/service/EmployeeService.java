package springbootCRUD.demo.service;

import java.util.List;

import springbootCRUD.demo.entity.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployee();

	Employee getEmployeeById(int id);

	void save(Employee emp);

	void delete(int id);
}
