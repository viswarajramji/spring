package com.hibernate.exec;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Course;
import com.hibernate.entity.Instructor;

public class MyApplication {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Course.class).buildSessionFactory();
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			Instructor instr = new Instructor("hello", "raj", "viswaraj@gmail.com");
			Course c1=new Course("physics");
			Course c2=new Course("chemistry");
			Course c3=new Course("maths");
			List<Course> course=new ArrayList<>();
			course.add(c1);
			course.add(c2);
			course.add(c3);
			instr.setCourses(course);
			session.save(instr);
			session.getTransaction().commit();
			session.close();

		} finally {
			sessionFactory.close();
		}
	}
}
