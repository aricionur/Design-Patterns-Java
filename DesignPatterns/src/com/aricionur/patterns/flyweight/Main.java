package com.aricionur.patterns.flyweight;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Creating objects for codes using Flyweight Design Pattern..");
		 
		int[] codes = {1,2,3,4,5,1,2,3,1,2,1};
		
		ObjectManager.getInstance().addCodes(codes);
		ObjectManager.getDocument();
		
	}
	
}
