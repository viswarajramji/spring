package com.myapplication;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Instructor;
import com.entity.Instructor_Details;

public class MyApplication {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Instructor_Details.class).buildSessionFactory();
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			Instructor instructor = new Instructor("viswarajramji1", "ramji");
			Instructor_Details inst_details = new Instructor_Details("CSE1", "India");
			instructor.setInstructionDetails(inst_details);
			inst_details.setInstructor(instructor);
			session.save(inst_details);
			session.getTransaction().commit();

		} catch (Exception e) {
			sessionFactory.close();
		}
	}
}
