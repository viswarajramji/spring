package com.hibernate.exec;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;

public class Reading {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class)
				.buildSessionFactory();
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			Student s1 = new Student("Guru", "advanth", "Guru93@gmail.com");
			session.save(s1);
			session.getTransaction().commit();
			session.close();
			System.out.println(s1.getId());
			// ------------------//
			// query new object
			session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			Student s2 = session.get(Student.class, s1.getId());
			session.getTransaction().commit();
			System.out.println(s2.toString());

			session.close();
		} finally {
			sessionFactory.close();
		}
	}
}
