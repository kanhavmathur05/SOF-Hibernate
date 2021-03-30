package com.aopaspectjaroundxmlex;

import org.aspectj.lang.ProceedingJoinPoint;

public class TrackRoad {
	
	public Object myAdvice(ProceedingJoinPoint pjp) throws Throwable { // it is an advice
		System.out.println("My Advice is to go slow as speed breaker is at front");
		Object obj = pjp.proceed();
		System.out.println("My Advice is to increase the speed now");
		return obj;
	}
}

//logging