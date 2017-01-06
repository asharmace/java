package com.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld1MainApp {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans1.xml");
		
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		
		obj.getMessage();
		
		HelloWorld obj2 = (HelloWorld) context.getBean("helloWorldaaaaaaa");
		
		obj2.getMessage();
	}
}
