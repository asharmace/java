package com.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextEditorMainApp {
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans7Inner.xml");
		TextEditor te = (TextEditor) context.getBean("textEditor");
		
		te.checkSpelling();
	}
}
