package com.nplusoneexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nplusoneexample.model.Department;
import com.nplusoneexample.model.Student;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sf=new Configuration().configure().buildSessionFactory();
    	
    	Session session=sf.openSession();
    	
    	Transaction t=session.beginTransaction();
    	
    	Department d1=new Department();
    	d1.setDepartmentId(1);
    	d1.setDepartmentName("IT");
    	
    	Department d2=new Department();
    	d2.setDepartmentId(2);
    	d2.setDepartmentName("Mechanical");
    	
    	Department d3=new Department();
    	d3.setDepartmentId(3);
    	d3.setDepartmentName("Electrical");
    	  	
    	Student s1=new Student();
    	s1.setStudentName("Max");
    	s1.setDepartment(d1);
    	
    	Student s2=new Student();
    	s2.setStudentName("Sam");
    	s2.setDepartment(d1);
    	
    	Student s3=new Student();
    	s3.setStudentName("Peter");
    	s3.setDepartment(d2);
    	
    	Student s4=new Student();
    	s4.setStudentName("Bruce");
    	s4.setDepartment(d2);
    	
    	Student s5=new Student();
    	s5.setStudentName("Tam");
    	s5.setDepartment(d3);
    	
    	Student s6=new Student();
    	s6.setStudentName("Jake");
    	s6.setDepartment(d3);
    	
    	Student s7=new Student();
    	s7.setStudentName("Dwayne");
    	s7.setDepartment(d3);
    	
    	Student s8=new Student();
    	s8.setStudentName("Nick");
    	s8.setDepartment(d3);
    	
//    	session.persist(d1);
//    	session.persist(d2);
//    	session.persist(d3);
    	
    	session.persist(s1);
    	session.persist(s2);
    	session.persist(s3);
    	session.persist(s4);
    	session.persist(s5);
    	session.persist(s6);
    	session.persist(s7);
    	session.persist(s8);
    	
    	t.commit();
    	session.close();
    }
}

