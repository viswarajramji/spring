package springbootCRUD.demo.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springbootCRUD.demo.DAO.EmployeeDAO;
import springbootCRUD.demo.entity.Employee;
import springbootCRUD.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	@Transactional
	public List<Employee> getAllEmployee() {
		return employeeDAO.getListOfEmployees();
	}

}
