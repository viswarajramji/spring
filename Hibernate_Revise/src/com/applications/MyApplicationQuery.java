package com.applications;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Users;

public class MyApplicationQuery {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Users.class).buildSessionFactory();
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			List<Users> list = session.createQuery("from Users u where u.name ='beast'").getResultList();
			session.getTransaction().commit();
			for (Users user : list) {
				System.out.println(user.getAddress());
			}
		} finally {
			sessionFactory.close();
		}
	}
}
