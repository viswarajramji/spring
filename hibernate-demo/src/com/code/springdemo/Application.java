package com.code.springdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.code.springdemo.entity.Customer;
import com.code.springdemo.service.CustomerService;

@Controller
@RequestMapping("/")
public class Application {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/home")
	public String getHome() {
		return "home";
	}

	@GetMapping("/listdata")
	public String getCustomers(Model model) {
		List<Customer> customer = customerService.getCustmerList();
		model.addAttribute("customers", customer);
		return "listdata";
	}

	@GetMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "showForm";
	}

	@PostMapping("/saveForm")
	public String saveForm(@ModelAttribute("customer") Customer customer) {
		customerService.save(customer);
		return "redirect:/listdata";
	}

	@GetMapping("/customer")
	public String getCustomerById(@RequestParam("id") int customer_id, Model model) {
		Customer customer = customerService.getCustomerById(customer_id);
		model.addAttribute("customer", customer);
		return "showForm";
	}

	@GetMapping("/delete")
	public String deleteCustomerById(@RequestParam("id") int customer_id) {
		customerService.deleteCustomerById(customer_id);
		return "redirect:/listdata"; 
	}

}
