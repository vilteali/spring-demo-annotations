package com.ar.alicode.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		SwimPerson person = context.getBean("swimPerson", SwimPerson.class);
		
		System.out.println(person.getYouSpeak());
		System.out.println(person.getDailyFortune());
		System.out.println(person.getEmail());
		System.out.println(person.getCompany());
		
		context.close();
		
	}

}
