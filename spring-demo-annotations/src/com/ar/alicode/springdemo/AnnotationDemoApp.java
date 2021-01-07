package com.ar.alicode.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Speak speak = context.getBean("person", Speak.class);
		Speak speak2 = context.getBean("director", Speak.class);
		
		System.out.println(speak.getYouSpeak());
		System.out.println(speak2.getYouSpeak());
		
		context.close();
		
	}

}
