package com.hibernate.exec;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;

public class MyApp {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			Student s1 = new Student("hello", "world", "viswarajramji93@gmail.com");
			session.save(s1);
			session.getTransaction().commit();
			System.out.println("Value inserted Successfully");
		} finally {
			sessionFactory.close();
		}
	}
}
