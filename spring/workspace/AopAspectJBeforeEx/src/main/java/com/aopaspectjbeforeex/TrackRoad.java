package com.aopaspectjbeforeex;

import org.aspectj.lang.JoinPoint;

public class TrackRoad {
	public void myadvice(JoinPoint jp) {	//it is advice
//		System.out.println("My advice is to go slow as speed breaker is in front.");
		System.out.println("My advice is to raise the speed as you crossed the speed breaker");
	}
}
