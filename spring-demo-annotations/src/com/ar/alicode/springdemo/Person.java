package com.ar.alicode.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person implements Speak {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public Person() {
		System.out.println("Person: inside default constructor");
	}
	
	/*@Autowired
	public Person(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/

	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	@Override
	public String getYouSpeak() {
		return "I'm speak english";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
