package com.springdemos.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	
public static void main(String[] args) {
		
		// create the spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springdemos/springcore/set/config.xml");
		
		// get the employee bean from the container
		CarDealer cardealer = (CarDealer) context.getBean("cardealer");
		
		// print the bean
		System.out.println(cardealer);
		
	}

}
