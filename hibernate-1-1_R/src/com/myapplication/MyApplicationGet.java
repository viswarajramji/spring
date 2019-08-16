package com.myapplication;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Instructor;
import com.entity.Instructor_Details;

public class MyApplicationGet {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Instructor_Details.class).buildSessionFactory();
		try {
			int id=1;
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			Instructor_Details instructor=session.get(Instructor_Details.class, id);
			System.out.println(instructor.getInstructor().getFirst_name());
			session.getTransaction().commit();

		} catch (Exception e) {
			sessionFactory.close();
		}
	}
}
