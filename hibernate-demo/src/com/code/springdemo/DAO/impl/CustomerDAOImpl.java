package com.code.springdemo.DAO.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.code.springdemo.DAO.CustomerDAO;
import com.code.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomerList() {
		Session session = sessionFactory.getCurrentSession();
		Query<Customer> query = session.createQuery("from Customer", Customer.class);
		List<Customer> customers = query.getResultList();
		return customers;
	}

	@Override
	public boolean save(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(customer);
		return false;
	}

	@Override
	public Customer getCustomerById(int customer_id) {
		Session session = sessionFactory.getCurrentSession();
		Customer customer = session.get(Customer.class, customer_id);
		return customer;
	}

	@Override
	public void deleteCustomerById(int customer_id) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("delete from Customer where id=:theCustomerId");
		query.setParameter("theCustomerId", customer_id);
		query.executeUpdate();
		return;

	}

}
