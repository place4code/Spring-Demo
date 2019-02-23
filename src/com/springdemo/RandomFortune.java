package com.springdemo;

import java.util.Random;

public class RandomFortune implements FortuneService {

	String fortunes[] = {"Lucky day", "Bad time", "More exercises"};
	
	@Override
	public String getFortune() {

		Random random = new Random();
		return fortunes[random.nextInt(3)];
		
	}

}
