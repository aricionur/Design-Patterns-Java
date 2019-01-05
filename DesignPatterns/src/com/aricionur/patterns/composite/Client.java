package com.aricionur.patterns.composite;

public class Client {

	Component allComponents;
	
	public Client(Component allComponents) {
		this.allComponents = allComponents;
	}
	
	public void printComponents() {
		allComponents.print();
	}
}
