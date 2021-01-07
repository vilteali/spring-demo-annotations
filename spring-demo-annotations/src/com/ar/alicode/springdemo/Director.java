package com.ar.alicode.springdemo;

import org.springframework.stereotype.Component;

@Component
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

}
