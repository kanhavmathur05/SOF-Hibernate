package com.aopaspectjaroundxmlex;

import org.aspectj.lang.JoinPoint;

public class Road {

	public int sb1() {
		System.out.println("Speed breaker 1");
		return 1;
	}
	
	public int sb2() {
		System.out.println("Speed breaker 2");
		return 2;
	}
	
	public int sb3() {
		System.out.println("Speed breaker 3");
		return 3;
	}

}
