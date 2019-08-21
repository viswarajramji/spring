package com.applications;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Users;

public class MyApplication {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Users.class).buildSessionFactory();
		try {
			Users user = new Users("Beast", "Mode");
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}
}
