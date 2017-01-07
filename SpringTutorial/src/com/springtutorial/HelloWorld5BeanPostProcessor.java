package com.springtutorial;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld5BeanPostProcessor {
	public static void main(String[] args)
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans5.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		
		obj.getMessage();
		context.registerShutdownHook();
	}
}
