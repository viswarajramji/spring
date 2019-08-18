package com.code.springdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.springdemo.entity.Customer;
import com.code.springdemo.service.CustomerService;

@RestController
@RequestMapping("/")
public class RestApplication {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/home")
	public String getHome() {
		return "home";
	}

	@GetMapping("/listdata")
	public List<Customer> getCustomers() {
		List<Customer> customer = customerService.getCustmerList();
		return customer;
	}

	@PostMapping("/add")
	public String addCustomer(@RequestBody Customer customer) {
		customer.setId(0);
		customerService.save(customer);
		return "addded Successfully";
	}

	@PostMapping("/update")
	public String updateCustomer(@RequestBody Customer customer) {
		customerService.save(customer);
		return "updated successfully";

	}

	@DeleteMapping("/delete/{customer_id}")
	public String deleteCustomer(@PathVariable("customer_id") int id) {
		customerService.deleteCustomerById(id);
		return "Successfully delete";
	}
//
//	@GetMapping("/showForm")
//	public String showForm(Model model) {
//		model.addAttribute("customer", new Customer());
//		return "showForm";
//	}
//
//	@PostMapping("/saveForm")
//	public String saveForm(@ModelAttribute("customer") Customer customer) {
//		customerService.save(customer);
//		return "redirect:/listdata";
//	}
//
//	@GetMapping("/customer")
//	public String getCustomerById(@RequestParam("id") int customer_id, Model model) {
//		Customer customer = customerService.getCustomerById(customer_id);
//		model.addAttribute("customer", customer);
//		return "showForm";
//	}
//
//	@GetMapping("/delete")
//	public String deleteCustomerById(@RequestParam("id") int customer_id) {
//		customerService.deleteCustomerById(customer_id);
//		return "redirect:/listdata"; 
//	}

}
