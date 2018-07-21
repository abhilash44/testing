package com.java.property;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runwelcome {

	public static void main(String[] args)
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
		Welcome b=(Welcome)context.getBean("welcome");
		System.out.println(b.getGreeting());
		b.getGreeting();

	}

}
