package com.java.learning.AspectJ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.learning.Services.ShapeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        ShapeService service =ctx.getBean("shapeService",ShapeService.class);
        service.getCircle().setName("Crocodile");
        System.out.println(service.getCircle().getName());
    }
}
