package com.hibernate.exec;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Instructor;
import com.hibernate.entity.Instructor_details;

public class MyApplication {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Instructor_details.class).buildSessionFactory();
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			Instructor_details instr_details = new Instructor_details("www.shan.com", "biker");
			Instructor instr = new Instructor("shan", "Micheal", "shanmicheal@gmail.com");
			instr.setInstructor_details(instr_details);
			session.save(instr);
			session.getTransaction().commit();
			session.close();

		} finally {
			sessionFactory.close();
		}
	}
}
