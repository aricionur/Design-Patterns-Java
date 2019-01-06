package com.aricionur.patterns.builder;

public interface Builder {


	void buildPartA(String input);
	void buildPartB(String input);
	void buildPartC(String input);
	public Product getProduct();
	
}
