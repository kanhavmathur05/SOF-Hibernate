package com.firstdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData {
	public static void main(String args[]) {
		
		SessionFactory sessionFactory=null;
		
		final StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
		
		try {
			sessionFactory=new MetadataSources(registry).buildMetadata().buildSessionFactory();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
//		creating session object
		Session session=sessionFactory.openSession();
		
//		creating transaction object
		Transaction t=session.beginTransaction();
		
		Employee e =new Employee();
		e.setFirstName("Peter");
		e.setLastName("Parker");
		
		session.persist(e);	//persisting the object
		
		t.commit();	//transaction is commited
		
		session.close();
	
		System.out.println("Successfully saved");
	}
}
