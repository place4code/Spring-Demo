package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		//load Spring configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive bean from context
		CricketCoach myCoach = context.getBean("cricketCoach", CricketCoach.class);
		
		System.out.println(myCoach.getDailyFortune());
		System.out.println(myCoach.getRandomFortune());
		System.out.println(myCoach.getRandomFortune());
		System.out.println(myCoach.getRandomFortune());
		
		//call our new methods to get the literal values
		System.out.println(myCoach.getTeam());
		System.out.println(myCoach.getEmailAdress());
		
		//clse the context
		context.close();

	}

}
