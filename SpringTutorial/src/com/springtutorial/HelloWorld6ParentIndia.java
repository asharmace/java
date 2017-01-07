package com.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld6ParentIndia {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans6.xml");
		
		HelloWorld2 obj1 = (HelloWorld2) context.getBean("helloWorld");
		obj1.getMessage1();
		obj1.getMessage2();
		
		HelloIndia obj2 = (HelloIndia) context.getBean("helloIndia");
		obj2.getMessage1();
		obj2.getMessage2();
		obj2.getMessage3();
	}
}
