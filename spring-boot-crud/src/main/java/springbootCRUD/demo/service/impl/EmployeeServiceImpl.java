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

	@Override
	@Transactional
	public Employee getEmployeeById(int id) {
		return employeeDAO.getEmployeeById(id);
	}

	@Override
	@Transactional
	public void save(Employee emp) {
		employeeDAO.save(emp);
	}

	@Override
	@Transactional
	public void delete(int id) {
		employeeDAO.delete(id);
	}

}
