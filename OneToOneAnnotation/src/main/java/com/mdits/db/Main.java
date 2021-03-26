package com.mdits.db;

import java.util.Calendar;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mdits.model.Applicant;
import com.mdits.model.Passport;
import com.mdits.util.HibernateUtil;

public class Main {
	public static void main(String[] args) {
		
		// Get session factory using Hibernate Util class
		SessionFactory sf = HibernateUtil.getSessionFactory();
		
		// Get session from Sesson factory
		Session session = sf.openSession();

		// Begin transaction
		Transaction t = session.beginTransaction();
		
		//Create Applicant Model data
		Applicant applicant = new Applicant();
		applicant.setName("John");
		applicant.setAge(28);
		applicant.setCity("Newyork");

		//Create Passport Model data
		Passport passport = new Passport();
		passport.setPassportNumber("ABCDE1111Z");
		passport.setIssuedDate(new Date());
		
		Calendar date = Calendar.getInstance();
		date.setTime(new Date());
		date.add(Calendar.YEAR, 10);
		passport.setExpiryDate(date.getTime());

		applicant.setPassport(passport);
		passport.setApplicant(applicant);
		session.persist(applicant);

		// Commit the transaction and close the session
		t.commit();
		session.close();
		System.out.println("successfully persisted Applicant details");
	}

}
