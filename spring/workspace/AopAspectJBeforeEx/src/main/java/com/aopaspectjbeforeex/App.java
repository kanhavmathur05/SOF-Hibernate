package com.aopaspectjbeforeex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
    	Road road=(Road) context.getBean("roadBean");
    	
    	System.out.println("-----------------------------------------");
    	System.out.println("SB1 arriving");
    	
    	road.sb1();
    	
    	System.out.println("---------------------------------------");
    	System.out.println("SB2 arriving");
    	
    	road.sb2();
    	
    	System.out.println("----------------------------------------");
    	System.out.println("SB3 is arriving");
    	
    	road.sb3();
    }
}
