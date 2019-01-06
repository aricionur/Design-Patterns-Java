package com.aricionur.patterns.builder;

public class Main {

	
	public static void main(String[] args) {
		
		Builder builder = new ConcreteBuilder();
		Director director = new Director(builder);
		director.Construct("This a feature for Part A", "This is a feature for Part B");
		director.printProductFeatures();
		
	}
}
