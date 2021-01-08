package com.ar.alicode.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Speak person = context.getBean("person", Speak.class);
	
		System.out.println(person.getDailyFortune());
		
		context.close();
		
	}

}
