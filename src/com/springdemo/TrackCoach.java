package com.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {

		return"from Track Coach Spring";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}
	
	//add an init method
	public void initMethod() {
		System.out.println("initMethod");
	}
	
	//add a destroy method
	public void destroyMethod() {
		System.out.println("destroyMethod");
	}
}
