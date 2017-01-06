package com.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld3PrototypeMainApp {
	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans3.xml");
		
		HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
		
		obj1.setMessage("Changed Message");
		obj1.getMessage();
		
		HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld");
		obj2.getMessage();
		
	}
}
