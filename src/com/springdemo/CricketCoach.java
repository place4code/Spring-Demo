package com.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService, randomFortuneService;
	private String emailAdress;
	private String team;

	public CricketCoach() {
		System.out.println("CricketCoach constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Daily workout cricket";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public String getRandomFortune() {
		return randomFortuneService.getFortune();
	}

	public void setRandomFortuneService(FortuneService randomFortuneService) {
		System.out.println("setter CricketCoach randomFortuneService");
		this.randomFortuneService = randomFortuneService;
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("setter CricketCoach fortuneService");
		this.fortuneService = fortuneService;
	}
	
	public void setEmailAdress(String emailAdress) {
		System.out.println("setter CricketCoach emailAdress");
		this.emailAdress = emailAdress;
	}

	public void setTeam(String team) {
		System.out.println("setter CricketCoach team");
		this.team = team;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public String getTeam() {
		return team;
	}
}
