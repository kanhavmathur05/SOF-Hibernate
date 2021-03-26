package com.onetoone.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory= buildessionFactory();
	
	private static final SessionFactory buildessionFactory() {
		try {
//			create the session factory from hibernate.cfg.xml
			return new Configuration().configure().buildSessionFactory();
		}
		catch (Exception e) {
//			Make sure you log the exception to track it
			System.out.println("Session Factory creation Failed: "+e);
			throw new ExceptionInInitializerError();
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static void shutDown() {
//		Optional but can be used to close caches and connection pools
		getSessionFactory().close();
	}
}
