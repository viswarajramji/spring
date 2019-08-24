package springbootCRUD.demo.DAO;

import java.util.List;

import springbootCRUD.demo.entity.Employee;

public interface EmployeeDAO {
	List<Employee> getListOfEmployees();

	Employee getEmployeeById(int id);

	void save(Employee emp);

	void delete(int id);
}
