package com.ar.alicode.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FreeDayFortuneService implements FortuneService {

	private final String[] DEMO_DAYS = {
		"Monday", "Tuesday", "Wednesday","Thursday","Friday"
	};
	
	Random myRandomDay = new Random();
	
	@Override
	public String getFortune() {
		
		int index = myRandomDay.nextInt(DEMO_DAYS.length);
		String freeDayFortune = DEMO_DAYS[index];
		return freeDayFortune;

	}

}
