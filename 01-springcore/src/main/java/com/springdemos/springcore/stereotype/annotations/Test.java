package com.springdemos.springcore.stereotype.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	
public static void main(String[] args) {
		
		// create the spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springdemos/springcore/stereotype/annotations/config.xml");
		
		// get the employee bean from the container
		Coach coach = (Coach) context.getBean("coach");
		
		// print the bean
		System.out.println(coach);
		System.out.println(coach.hashCode());
		
	}

}
