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

	public void setTypeOneBehavior(TypeOneBehavior typeOneBehavior) {
		this.typeOneBehavior = typeOneBehavior;
	}
	
	public void setTypeTwoBehavior(TypeTwoBehavior typeTwoBehavior) {
		this.typeTwoBehavior = typeTwoBehavior;
	}
	
}
