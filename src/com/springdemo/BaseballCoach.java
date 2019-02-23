package com.springdemo;

public class BaseballCoach implements Coach {

	//private for injection
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return"from Baseball Coach";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	

}
