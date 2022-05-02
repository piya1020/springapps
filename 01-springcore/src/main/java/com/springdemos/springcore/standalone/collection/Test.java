package com.springdemos.springcore.standalone.collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	
public static void main(String[] args) {
		
		// create the spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springdemos/springcore/standalone/collection/config.xml");
		
		// get the employee bean from the container
		ProductList prods = (ProductList) context.getBean("prods");
		
		// print the bean
		System.out.println(prods);
		//System.out.println(mydao.getDialect().getClass());
		
	}

}
