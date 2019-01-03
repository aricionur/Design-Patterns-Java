package com.aricionur.patterns.strategy;

public class SubClassB extends SuperClass{

	public SubClassB() {
		typeOneBehavior = new TypeOneBehaviorConcreteClassB(); // Class--> B
		typeTwoBehavior = new TypeTwoBehaviorConcreteClassB(); // Class--> B
	}
}
