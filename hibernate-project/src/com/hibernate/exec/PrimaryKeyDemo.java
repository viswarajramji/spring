package com.hibernate.exec;

import java.nio.channels.SeekableByteChannel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;

public class PrimaryKeyDemo {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class)
				.buildSessionFactory();
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			Student s1 = new Student("shan1", "micheal1", "shan93@gmail.com");
			Student s2 = new Student("shan2", "micheal2", "shan94@gmail.com");
			Student s3 = new Student("shan3", "micheal3", "shan95@gmail.com");
			session.save(s1);
			session.save(s2);
			session.save(s3);
			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}
}
