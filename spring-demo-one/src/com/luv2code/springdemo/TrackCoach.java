package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run few more rounds of 5KM each ";
	}

	@Override
	public String getDailyFortune() {
		return "Just Try It: " + fortuneService.getFortune();
	}
}
