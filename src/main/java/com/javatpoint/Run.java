package com.javatpoint;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springbean.xml");
		Phone bf=(Phone) ctx.getBean("phone");
		System.out.println("printing msz");
		bf.message();
		System.out.println("Printing number");
		bf.number();
	}

}
