package com.ar.alicode.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Director implements Speak {

	@Override
	public String getYouSpeak() {
		// TODO Auto-generated method stub
		return "I'm going to teaching to the students";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	
	// define my init method
	@PostConstruct
	public void doMyInitMethod() {
		System.out.println(">> Person: inside of doMyInitMethod()");
	}
	
	// define my destroy method
	@PreDestroy
	public void doMyDestroyMethod() {
		System.out.println(">> Person: inside of doMyDestroyMethod()");
	}
	
}
