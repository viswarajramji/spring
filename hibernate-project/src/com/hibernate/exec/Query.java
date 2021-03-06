package com.hibernate.exec;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;

public class Query {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			List<Student> students = session.createQuery("from Student").getResultList();
			for (Student std : students) {
				System.out.println(std.getEmailId() + " " + std.getFirstName() + " " + std.getLastName());
			}
			session.getTransaction().commit();
			session.close();
			session = sessionFactory.getCurrentSession();
			//where conditions
			System.out.println("--------------select by Guru--------------");
			session.beginTransaction();
			students = session.createQuery("from Student s where s.firstName = 'Guru'").getResultList();
			for (Student std : students) {
				System.out.println(std.getEmailId() + " " + std.getFirstName() + " " + std.getLastName());
			}
			session.getTransaction().commit();
			session.close();
			
		} finally {
			sessionFactory.close();
		}
	}
}
