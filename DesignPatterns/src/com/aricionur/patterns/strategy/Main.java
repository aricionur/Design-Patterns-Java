package com.aricionur.patterns.strategy;

public class Main {

	
	public static void main(String[] args) {
		
		SuperClass superClassOne = new SubClassA();
		superClassOne.performTypeOneBehavior();
		superClassOne.performTypeTwoBehavior();
		
		SuperClass superClassTwo = new SubClassB();
		superClassTwo.performTypeOneBehavior();
		superClassTwo.performTypeTwoBehavior();
	}
	
	
}
