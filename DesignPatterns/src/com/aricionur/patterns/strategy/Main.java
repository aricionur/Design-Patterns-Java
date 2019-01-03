package com.aricionur.patterns.strategy;

public class Main {

	
	public static void main(String[] args) {
		
		SuperClass superClassOne = new SubClassA();
		superClassOne.performTypeOneBehavior();
		superClassOne.performTypeTwoBehavior();
		superClassOne.setTypeOneBehavior(new TypeOneBehaviorConcreteClassB()); // dynamic behavior change 
		superClassOne.performTypeOneBehavior();
		
		SuperClass superClassTwo = new SubClassB();
		superClassTwo.performTypeOneBehavior();
		superClassTwo.performTypeTwoBehavior();
	}
	
	
}
