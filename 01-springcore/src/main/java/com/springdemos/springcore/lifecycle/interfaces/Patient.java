package com.springdemos.springcore.lifecycle.interfaces;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean{

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Inside the id setter method..");
	}
	
	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	@PostConstruct
	public void hi() throws Exception {
		System.out.println("Inside hi method");
		
	}

	@PreDestroy
	public void bye() throws Exception {
		System.out.println("Inside afterpeopertiesSet method...");
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
}
