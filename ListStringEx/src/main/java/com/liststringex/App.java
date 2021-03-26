package com.liststringex;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();

    	Transaction t=session.beginTransaction();
    	
    	ArrayList<String> list1=new ArrayList<String>();
    	list1.add("Money is Power");
    	list1.add("Money is Happiness");
    	list1.add("Money is Health");
    	list1.add("Money is Energy");
    	list1.add("Money is Destroyer");
    	
    	Question questioin1=new Question();
    	questioin1.setQname("What is Java?");
    	questioin1.setAnswers(list1);
    	
    	Question question2=new Question();
    	question2.setQname("What is Money?");
    	question2.setAnswers(list1);
    	
    	session.persist(questioin1);
    	session.persist(question2);
    	
    	t.commit();
    	session.close();
    	System.out.println("Success");
    }
}
