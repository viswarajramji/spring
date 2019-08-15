package com.hibernate.exec;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;

public class UpdateOperationSession {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class)
				.buildSessionFactory();
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			int id = 1;
			Student student = session.get(Student.class, id);
			System.out.println(student.getFirstName());
			student.setFirstName("hello world man");
			session.getTransaction().commit();

			System.out.println("-------reteriving values----------");
			session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			student = session.get(Student.class, id);
			System.out.println(student.getFirstName());
			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}

	}
}
