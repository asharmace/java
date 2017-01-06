package com.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld2SingletonMainApp {
	public static void main(String[] args){
	
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
		
		HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
		
		obj1.setMessage("Changing Message by Obj1");
		
		HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld");
		
		obj2.getMessage();
	}
}
