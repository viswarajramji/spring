package springbootCRUD.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springbootCRUD.demo.entity.Employee;
import springbootCRUD.demo.service.EmployeeService;

@RestController
public class MyController {

	@Autowired
	private EmployeeService empService;

	@GetMapping("/")
	public String getHome() {
		return "welcome to index page";
	}

	@GetMapping("/listdata")
	public List<Employee> getRequest() {
		return empService.getAllEmployee();
	}

	@RequestMapping("/saved")
	public String save(@RequestBody Employee emp) {
		emp.setId(0);
		empService.save(emp);
		return "Added Successfully";
	}

	@RequestMapping("/delete/{employee_id}")
	public String save(@PathVariable("employee_id") int emp_id) {
		empService.delete(emp_id);
		return "Removed";
	}

	@RequestMapping("/get/{employee_id}")
	public Employee getEmployee(@PathVariable("employee_id") int emp_id) {
		return empService.getEmployeeById(emp_id);

	}
}
