package com.onetoone;

import java.util.Calendar;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.onetoone.model.Applicant;
import com.onetoone.model.Passport;
import com.onetoone.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	Get session factory from HibernateUtil Class
        SessionFactory sf=HibernateUtil.getSessionFactory();
        
//        Get session from session Factory
        Session session=sf.openSession();
        
//        Begin Transaction
        Transaction t=session.beginTransaction();
        
//        Create Applicant Model Data
        Applicant applicant=new Applicant();
        applicant.setName("John");
        applicant.setCity("New York");
        applicant.setAge(28);
        
        Passport passport=new Passport();
        passport.setPassportNumber("ABCDE1111Z");
        passport.setIssuedDate(new Date());
        
        Calendar date=Calendar.getInstance();
        date.setTime(new Date());
        date.add(Calendar.YEAR, 10);
        passport.setExpiryDate(date.getTime());
        
        applicant.setPassport(passport);
        passport.setApplicant(applicant);
        
        session.persist(applicant);
    
//        Commit the transaction and close the details
        t.commit();
        session.close();
        System.out.println("Successfully persisted Applicant Details");
    }
}
