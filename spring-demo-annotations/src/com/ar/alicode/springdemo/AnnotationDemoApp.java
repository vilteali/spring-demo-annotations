package com.ar.alicode.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Speak speak = context.getBean("person", Speak.class);
		
		System.out.println(speak.getYouSpeak());
		System.out.println(speak.getDailyFortune());
		
		context.close();
		
	}

}
