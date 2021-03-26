package com.tableperhierarchyxml;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Session session=new Configuration().configure("hibernate.cfg.xml")
    			.buildSessionFactory().openSession();
    	
    	Transaction t=session.beginTransaction();
    	
    	Regular_Employee e2=new Regular_Employee();
    	e2.setName("ravali");
    	e2.setSalary(180000);
    	e2.setBonus(1000);
    	
    	Contract_Employee e3=new Contract_Employee();
    	e3.setName("jyoti");
    	e3.setPay_per_hour(1900);
    	e3.setContract_duration("40 hours");
    	
    	session.persist(e2);
    	session.persist(e3);
    	
    	t.commit();
    	
    	session.close();
    	System.out.println("Success");
    }
}
