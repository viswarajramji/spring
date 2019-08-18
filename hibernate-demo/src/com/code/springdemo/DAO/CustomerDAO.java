package com.code.springdemo.DAO;

import java.util.List;

import com.code.springdemo.entity.Customer;

public interface CustomerDAO {

	List<Customer> getCustomerList();
	
	boolean save(Customer customer);
	
	Customer getCustomerById(int customer_id);
	
	void deleteCustomerById(int customer_id);
}
