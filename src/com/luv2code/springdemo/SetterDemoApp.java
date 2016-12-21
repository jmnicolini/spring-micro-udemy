package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		// load the spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve the bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());

		// retrieve the bean from spring container
		TrackCoach theTrackCoach = context.getBean("myCoach", TrackCoach.class);
		
		// call methods on bean
		System.out.println(theTrackCoach.getDailyWorkout());
		
		System.out.println(theTrackCoach.getDailyFortune());
		
		// close context
		context.close();

	}

}
