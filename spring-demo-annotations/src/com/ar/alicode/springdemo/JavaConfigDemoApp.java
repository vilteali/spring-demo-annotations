package com.ar.alicode.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		Speak speak = context.getBean("person", Speak.class);
		
		System.out.println(speak.getYouSpeak());
		System.out.println(speak.getDailyFortune());
		
		context.close();
		
	}

}
