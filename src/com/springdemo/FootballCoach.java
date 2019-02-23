package com.springdemo;

public class FootballCoach implements Coach {

	private FortuneService fs;
	
	public FootballCoach(FortuneService fs) {
		this.fs = fs;
	}

	@Override
	public String getDailyWorkout() {
		return"from Football Coach Spring";
	}

	@Override
	public String getDailyFortune() {
		return fs.getFortune();
	}

}
