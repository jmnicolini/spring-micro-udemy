package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach () {
		System.out.println("TrackCoach default constructor");
	}
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		System.out.println("TrackCoach constructor with fortunService argument");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it:" + fortuneService.getFortune();
	}

}
