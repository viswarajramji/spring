package com.applications;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Courses;
import com.entity.Students;

public class MyApplication {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Courses.class)
				.addAnnotatedClass(Students.class).buildSessionFactory();
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			Students student = new Students("viswa", "raj");
			Courses c1 = new Courses("shan", "dude");
			student.setCourses(c1);
			session.save(student);
			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}
}
