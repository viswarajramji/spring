package com.applications;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Users;

public class MyApplication {
	public static void main(String[] args) {
			
	}

	
	
	public static void updateQuery(int id) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Users.class).buildSessionFactory();
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			Query query = session.createQuery("update Users s set s.name='dude' where s.name='Beast'");
			query.executeUpdate();
			session.getTransaction().commit();

		} finally {
			sessionFactory.close();
		}
	}

	public static void update(int id) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Users.class).buildSessionFactory();
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			Users user = session.get(Users.class, id);
			user.setAddress("hello");
			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}

	public static void save(int id) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Users.class).buildSessionFactory();
		try {
			Users user = new Users("Beast", "Mode");
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}

	public static void displayAllData() {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Users.class).buildSessionFactory();

		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			List<Users> users = session.createQuery("from Users").getResultList();
			for (Users user : users) {
				System.out.println(user.getAddress());
				System.out.println(user.getId());
				System.out.println(user.getName());
			}
		} finally {

		}
	}

}
