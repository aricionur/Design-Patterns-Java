package com.aricionur.patterns.state;

public class Main {
	
	public static void main(String[] args) {
		
		Context context = new Context();
		System.out.println("Current state : " + context.getCurrentState().toString());
		
		context.methodA();
		System.out.println("Current state : "+ context.getCurrentState().toString());
		
		context.methodB();
		System.out.println("Current state : "+ context.getCurrentState().toString());
		
		context.methodC();
		System.out.println("Current state : "+ context.getCurrentState().toString());
		
	}

}
