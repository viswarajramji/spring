package com.hibernate.exec;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Instructor;
import com.hibernate.entity.Instructor_details;

public class MyAppDelete {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Instructor_details.class).buildSessionFactory();
		try {
			int id=1;
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			Instructor instructor=session.get(Instructor.class, id);
			session.delete(instructor);
			session.getTransaction().commit();
			session.close();
		} finally {
			sessionFactory.close();
		}
	}
}
