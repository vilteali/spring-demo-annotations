package com.ar.alicode.springdemo;

import org.springframework.stereotype.Component;

@Component("thePerson")
public class Person implements Speak {

	@Override
	public String getYouSpeak() {
		return "I'm speak english";
	}

}
