package com.springdemos.springcore.depedencycheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// create the spring container - box
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/depedencycheck/config.xml");
		context.registerShutdownHook();

		// get the hospital bean from the container
		Prescription prescription = (Prescription) context.getBean("prescription");
		
		// print the bean
		System.out.println(prescription);
		
	}

}