package com.springtutorial;

public class HelloWorld {
	private String message;
	
	public void setMessage(String msg)
	{
		message = msg;
	}
	
	public void getMessage()
	{
		System.out.println("Your message is : " +message);
	}
	
	public void init()
	{
		System.out.println("Inside init method");
	}
	
	public void destroy()
	{
		System.out.println("Inside destroy method");
	}
}
