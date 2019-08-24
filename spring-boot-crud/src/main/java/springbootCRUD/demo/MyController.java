package springbootCRUD.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
