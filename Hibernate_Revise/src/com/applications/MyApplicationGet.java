package com.applications;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Users;

public class MyApplicationGet {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Users.class).buildSessionFactory();
		try {
			int id = 1;
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			Users user = session.get(Users.class, id);
			session.getTransaction().commit();
			System.out.println(user.getAddress());
		} finally {
			sessionFactory.close();
		}
	}
}
