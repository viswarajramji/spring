package com.hibernate.exec;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;

public class DeleteOperationUsingQuery {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class)
				.buildSessionFactory();
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			session.createQuery("delete from Student s where s.firstName='shan1'").executeUpdate();
			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}

	}
}
