package com.aricionur.patterns.bridge;

public class ConcreteImplementorA implements Implementor{

	@Override
	public void operationImpl() {
		System.out.println("running operationImpl() method of ConcreteImplementorA");
		
	}

}
