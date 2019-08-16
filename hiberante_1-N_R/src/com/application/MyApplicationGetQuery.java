package com.application;

import javax.persistence.CascadeType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Course;
import com.entity.Instructor;

public class MyApplicationGetQuery {
	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Course.class).buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {

			// start a transaction
			session.beginTransaction();
			int id = 2;
			Query<Instructor> query = session.createQuery(
					"select i from Instructor i JOIN FETCH i.course where i.id=:theResutlQuery",
					Instructor.class

			);
			query.setParameter("theResutlQuery", id);
			Instructor instructor = query.getSingleResult();
			// commit transaction
			session.getTransaction().commit();
			session.close();
			System.out.println(instructor.getFirstName());

			System.out.println("Done!");
		} finally {

			// add clean up code
			session.close();

			factory.close();
		}
	}
}
