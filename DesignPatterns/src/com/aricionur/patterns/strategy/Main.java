package com.aricionur.patterns.strategy;

public class Main {

	
	public static void main(String[] args) {
		
		SuperClass superClass = new SubClassA();
		superClass.performTypeOneBehavior();
		superClass.performTypeTwoBehavior();
	}
}
