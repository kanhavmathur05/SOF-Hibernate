package com.aopaspectjbeforeex;

public class Road {
	
	public void sb1() {
		System.out.println("Speed Breaker 1");
	}
	
	public int sb2() {
		System.out.println("Speed Breaker 2");
		return 2;
	}
	
	public int sb3() {
		System.out.println("Speed Breaker 3");
		return 3;
	}
}

//logging