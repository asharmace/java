package com.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaCollectionsMainApp {
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans8Collections.xml");
		
		JavaCollections jc = (JavaCollections) context.getBean("javaCollections");
		
		jc.getAddressList();
		jc.getAddressSet();
		jc.getAddressMap();
		jc.getAddressProp();
	}

}
