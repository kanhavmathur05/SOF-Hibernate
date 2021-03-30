package com.springsampleex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		//get the required bean
		Employee employee=(Employee) context.getBean("empBean1");
		employee.display();
	}
}
