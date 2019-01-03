package com.aricionur.patterns.strategy;

public class SuperClass {

	TypeOneBehavior typeOneBehavior;

	TypeTwoBehavior typeTwoBehavior;

	public void performTypeOneBehavior() {
		typeOneBehavior.doTypeOneBehavior();
	}

	public void performTypeTwoBehavior() {
		typeTwoBehavior.doTypeTwoBehavior();
	}

}
