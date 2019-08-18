package com.code.springdemo.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.springdemo.DAO.CustomerDAO;
import com.code.springdemo.entity.Customer;
import com.code.springdemo.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;

	@Override
	@Transactional
	public List<Customer> getCustmerList() {
		// TODO Auto-generated method stub
		return customerDAO.getCustomerList();

	}

	@Override
	@Transactional
	public boolean save(Customer customer) {
		customerDAO.save(customer);
		return true;
	}

}
