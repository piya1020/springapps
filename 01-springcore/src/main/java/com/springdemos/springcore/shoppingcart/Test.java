package com.springdemos.springcore.shoppingcart;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	
public static void main(String[] args) {
		
	// create the spring container - box
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
					"com/springdemos/springcore/shoppingcart/config.xml");

			//Get the 'shoppingcart' bean from the container (Defined in the config.xml  file)
			ShoppingCart shoppingcart = (ShoppingCart) context.getBean("shoppingcart");
			
			//Printing the Bean
			System.out.println(shoppingcart);
		
	}

}
