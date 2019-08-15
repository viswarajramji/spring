package com.hibernate.exec;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;

public class DeleteOperationSession {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class)
				.buildSessionFactory();
		try {
			int id = 2;
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			Student student = session.get(Student.class, id);
			session.delete(student);
			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}

	}
}
