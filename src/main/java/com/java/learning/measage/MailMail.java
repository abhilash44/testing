package com.java.learning.measage;

import java.io.File;

import javax.mail.internet.MimeMessage;

import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class MailMail 
{
	private JavaMailSender mailSender;

	public MailMail() 
	{

	}

	public void setMailSender(JavaMailSender mailSender)
	{
		this.mailSender = mailSender;
	}



	public void sendMail(String from, String to, String subject, String msg)
	{
		/*SimpleMailMessage s = new SimpleMailMessage();
		s.setFrom(from);
		s.setTo(to);
		s.setSubject(subject);
		s.setText(msg);

		mailSender.send(s);*/
		try {
			MimeMessage m = mailSender.createMimeMessage();
			MimeMessageHelper mm= new MimeMessageHelper(m,true);
			mm.setFrom(from);  
			mm.setTo(to);  
			mm.setSubject(subject);  
			mm.setText(msg);
			mm.addAttachment("dekho", new FileSystemResource("D:/Iphone_Camera/Maa+Papa+Trips/IMG_8004.JPG"));
			System.out.println("photo sent");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
