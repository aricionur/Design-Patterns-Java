package com.aricionur.patterns.builder;

public class ConcreteBuilder implements Builder{

	Product product;
	
	public ConcreteBuilder() {
		this.product = new Product();
	}

	@Override
	public void buildPartA(String input) {
		product.setPartA(input);
		
	}

	@Override
	public void buildPartB(String input) {
		product.setPartB(input);
	}

	@Override
	public void buildPartC(String input) {
		product.setPartC(input);	
	}

	@Override
	public Product getProduct() {
		
		return this.product;
	}
	
	

}
