package com.ar.alicode.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.ar.alicode.springdemo")
public class SportConfig {
	
	// define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	
	}
	
	// define bean for our swim speak AND inject dependency 
	@Bean
	public Speak swimPerson() {
		return new SwimPerson(sadFortuneService());
	}
}
