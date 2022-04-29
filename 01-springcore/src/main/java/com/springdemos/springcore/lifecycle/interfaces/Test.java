package com.springdemos.springcore.lifecycle.interfaces;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	
public static void main(String[] args) {
		
	// create the spring container - box
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
					"com/springdemos/springcore/lifecycle/interfaces/config.xml");

			//Get the 'shoppingcart' bean from the container (Defined in the config.xml  file)
			Patient patient = (Patient) context.getBean("patient");
			
			//Printing the Bean
			System.out.println(patient);
			context.registerShutdownHook();
		
	}

}
