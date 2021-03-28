package com.nplusoneexample;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nplusoneexample.model.Department;
import com.nplusoneexample.model.Student;

public class Main {
	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		
//		List<Department> departmentList=session.createQuery("From Department",Department.class).getResultList();
		List<Department> departmentList=session.createQuery("From Department d JOIN fetch d.studentList",Department.class).getResultList();
		System.out.println("Students list in each department:-");
		for(Department d:departmentList) {
			System.out.println("Department Name: "+d.getDepartmentName());
			for(Student s:d.getStudentList()) {
				System.out.println(s.getStudentName());
			}
		}
		session.close();
	}
}
