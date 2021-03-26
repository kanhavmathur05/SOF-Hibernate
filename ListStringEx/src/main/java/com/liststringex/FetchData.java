package com.liststringex;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FetchData {
	public static void main(String args[]) {
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();

		Query query=session.createQuery("from Question");
		
		List<Question> list=query.getResultList();
		
		Iterator<Question> itr=list.iterator();
		
		while(itr.hasNext()) {
			Question q=itr.next();
			System.out.println("Question: "+q.getQname());
			
			List<String> list2=q.getAnswers();
			Iterator<String> itr2=list2.iterator();
			while(itr2.hasNext()) {
				System.out.println("Answer: "+itr2.next());
			}
		}
		session.close();
		System.out.println("Success");
	}
}
