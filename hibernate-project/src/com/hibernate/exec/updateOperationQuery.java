package com.hibernate.exec;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;

public class updateOperationQuery {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class)
				.buildSessionFactory();
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			session.createQuery("update Student s set s.emailId='dude123@gmail.com' where s.firstName='hello'").executeUpdate();
			session.getTransaction().commit();
		} catch (Exception e) {
			sessionFactory.close();
		}
	}
}
