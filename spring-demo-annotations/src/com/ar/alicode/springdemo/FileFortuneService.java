package com.ar.alicode.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {
	
	// Definimos la ubicación de nuestro archivo a leer
	private String fileName = "C:\\Users\\Vilte\\Documents\\Ali\\fortune-data.txt";
	private List<String> theFortunes;
	private Random myRandom = new Random();
	
	public FileFortuneService() {
		System.out.println(">> FileFortuneService: inside default constructor");
	}	
	
	@PostConstruct
	public void loadTheFortunesList() {
		System.out.println(">> FileFortuneService: inside method loadTheFortunesFile");
		
		File theFile = new File(fileName);
		
		System.out.println("Reading fortunes from file: "+theFile);
		System.out.println("File exists: "+theFile.exists());
		
		theFortunes = new ArrayList<>();
		
		// Instaciamos el objeto como parametro del try para no declarar un finally
		try (BufferedReader myFile = new BufferedReader(new FileReader(theFile))) {
			
			String tempLine;
			
			while((tempLine = myFile.readLine()) != null) 
				theFortunes.add(tempLine);
			
		} catch (Exception e) { 
			e.printStackTrace();
		}
	}
	
	@Override
	public String getFortune() {
		
		int index = myRandom.nextInt(theFortunes.size());
		String tempFortune = theFortunes.get(index);
		
		return tempFortune;
	}

}
