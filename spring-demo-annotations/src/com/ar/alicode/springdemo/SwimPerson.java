package com.ar.alicode.springdemo;

public class SwimPerson implements Speak {

	private FortuneService fortuneService;
	
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

}
