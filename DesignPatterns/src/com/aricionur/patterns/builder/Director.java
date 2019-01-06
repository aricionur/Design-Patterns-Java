package com.aricionur.patterns.builder;

public class Director {

	Builder builder;
	
	
	public Director(Builder builder) {
	this.builder = builder;
	}
	
	public void Construct() {
		
	}
	public void Construct(String inputForPartA) {
		builder.buildPartA(inputForPartA);
		
	}
	public void Construct(String inputForPartA,
			String inputForPartB) {
		builder.buildPartA(inputForPartA);
		builder.buildPartB(inputForPartB);
	}
	public void Construct(String inputForPartA,
			String inputForPartB,
			String inputForPartC) {
		builder.buildPartA(inputForPartA);
		builder.buildPartB(inputForPartB);
		builder.buildPartC(inputForPartC);
	}
	
	public void printProductFeatures(){
		System.out.println("PartA : " + builder.getProduct().getPartA());
		System.out.println("PartB : " + builder.getProduct().getPartB());
		System.out.println("PartC : " + builder.getProduct().getPartC());
	}
	
	
	
	
}
