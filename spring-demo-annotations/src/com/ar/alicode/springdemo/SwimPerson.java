package com.ar.alicode.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimPerson implements Speak {

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.company}")
	private String company;
	
	public SwimPerson(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getYouSpeak() {
		return "Swim 1000 meters as a warm up";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return "email: "+email;
	}

	public String getCompany() {
		return "compañia: "+company;
	}

	
	
}
