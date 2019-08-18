package com.code.springdemo.service;

import java.util.List;

import com.code.springdemo.entity.Customer;

public interface CustomerService {
	List<Customer> getCustmerList();
	
	boolean save(Customer customer);
}
