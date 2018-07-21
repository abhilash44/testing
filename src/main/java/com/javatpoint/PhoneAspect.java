package com.javatpoint;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PhoneAspect 
{
	@Pointcut("execution(* Phone.*(..))")
	public void checking()
	{}
	@Before("checking()")
	public void myAdvive()
	{
		System.out.println("Checked before dispacthed");
	}
	@AfterReturning(pointcut="execution(* Phone.num*(..))",returning="result")
	public void done(JoinPoint j , Object result)
	{
		System.out.println("Ready to dispacthed" +j.getSignature() + "result is"+ result);
	}
}
