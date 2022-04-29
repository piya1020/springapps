package com.springdemos.springcore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	
public static void main(String[] args) {
		
		// create the spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springdemos/springcore/properties/config.xml");
		
		// get the employee bean from the container
		Locations location = (Locations) context.getBean("location");
		
		// print the bean
		System.out.println(location);
		System.out.println(location.getDialect().getClass());
		
	}

}
