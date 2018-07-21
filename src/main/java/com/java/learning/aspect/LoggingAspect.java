package com.java.learning.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	/*@Before("allCircle()) && allGetters()")
	public void LoggingAdvice() {
		System.out.println("Aspect is getting called");
	}

	@Before("allGetters())")
	public void secondAdvice() {
		System.out.println("secondAdvice is getting called");
	}*/
	
	@AfterReturning("args(name)")
	public void afterCalled(String name)
	{
		System.out.println("After is getting called..." + name);
	}

	@Pointcut(("within(com.java.learning.model.Circle)"))
	public void allCircle() {
	}

	@Pointcut("execution(* get*())")
	public void allGetters()
	{		
	}
}
