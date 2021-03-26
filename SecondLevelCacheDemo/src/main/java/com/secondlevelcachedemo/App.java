package com.secondlevelcachedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;

		Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();

		Transaction t = session.beginTransaction();


		Session session1=sessionFactory.openSession();
		Student s1 = (Student) session1.load(Student.class, 21);
//		session.close();

		Session session2 = sessionFactory.openSession();
		Student s2 = (Student) session2.load(Student.class, 21);

		session.close();
		session1.close();
		session2.close();
	}
}
