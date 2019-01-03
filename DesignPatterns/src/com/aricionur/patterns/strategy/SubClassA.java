package com.aricionur.patterns.strategy;

public class SubClassA extends SuperClass{

	public SubClassA() {
		typeOneBehavior = new TypeOneBehaviorConcreteClassA(); // Class-->A
		typeTwoBehavior = new TypeTwoBehaviorConcreteClassA(); // Class-->A			
	}
	
	
}
