package com.mdits.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mdits.model.Address;
import com.mdits.model.Person;
import com.mdits.util.HibernateUtil;

public class Main {
	public static void main(String[] args) {
		// Get session factory using Hibernate Util class
		SessionFactory sf = HibernateUtil.getSessionFactory();
		// Get session from Sesson factory
		Session session = sf.openSession();

		// Begin transaction
		Transaction t = session.beginTransaction();
		
		//Create Person Model data
		Person person = new Person();
		person.setFirstName("John");
		person.setLastName("KC");
		person.setAge(28);
		person.setEducation("Graduation");

		//Create Passport Model data
		Address currentAdd = new Address();
		currentAdd.setStreet("Royal road");
		currentAdd.setCity("Newyork");
		currentAdd.setZipcode("10001");
		
		//Associate Person to  current Address
		currentAdd.setPerson(person);
		
		Address permanentAdd = new Address();
		permanentAdd.setStreet("Manyar Road");
		permanentAdd.setCity("Sydney");
		permanentAdd.setZipcode("2060");
		
		//Associate Person to permanent Address
		permanentAdd.setPerson(person);
		
		session.persist(person);
		session.persist(currentAdd);
		session.persist(permanentAdd);

		// Commit the transaction and close the session
		t.commit();
		session.close();
		System.out.println("successfully persisted Person details");
	}

}
