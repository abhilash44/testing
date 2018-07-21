package com.java.learning.measage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMail {

	public static void main(String[] args)
	{
	 
		ApplicationContext contex= new ClassPathXmlApplicationContext("bean.xml");
		MailMail mail = (MailMail)contex.getBean("mailmail");
		String receiver="mr.unique143@gmail.com";//write here sender gmail id  
		String sender="xyz44@gmail.com";//write here receiver id  
		mail.sendMail(sender,receiver,"hi","photo");  		      
		System.out.println("success");  
		
	}

}
