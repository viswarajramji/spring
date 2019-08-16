package com.application;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Admin;
import com.entity.Course;

public class MyApplication {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Admin.class)
				.addAnnotatedClass(Course.class).buildSessionFactory();
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			Admin admin = new Admin("viswarajramji", "Kumar");
			Course c1 = new Course("chemistry");
			Course c2 = new Course("Maths");
			Course c3 = new Course("Physis");
			c1.setAdmin(admin);
			c2.setAdmin(admin);
			c3.setAdmin(admin);
			session.save(c1);
			session.save(c2);
			session.save(c3);
			session.getTransaction().commit();
		} catch (Exception e) {
			sessionFactory.close();
		}
	}
}
