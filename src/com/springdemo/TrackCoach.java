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

}
