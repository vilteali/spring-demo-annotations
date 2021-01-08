package com.ar.alicode.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] data = {
			"I'm writting code with service spring",
			"The journey is the reward",
			"Good luck for the gift card"
	};
	
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		
		return theFortune;
	}

}
