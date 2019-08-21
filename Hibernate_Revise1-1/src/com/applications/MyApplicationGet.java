package com.applications;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Courses;
import com.entity.Students;

public class MyApplicationGet {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Courses.class)
				.addAnnotatedClass(Students.class).buildSessionFactory();
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			Courses student = session.get(Courses.class, 1);
			session.getTransaction().commit();
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getStudent().getName());
			System.out.println(student.getId());

		} finally {
			sessionFactory.close();
		}
	}
}
