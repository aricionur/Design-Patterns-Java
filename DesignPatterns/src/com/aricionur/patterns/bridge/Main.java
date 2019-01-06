package com.aricionur.patterns.bridge;

public class Main {
	
	public static void main(String[] args) {
		
		Implementor implementor = new ConcreteImplementorA();
		AbstractClass abstractClassImpl = new AbstractClassImpl(implementor);
		abstractClassImpl.operation();
		
		Implementor implementorTwo = new ConcreteImplementorB();
		AbstractClass abstractClassImplTwo = new AbstractClassImpl(implementorTwo);
		abstractClassImplTwo.operation();
		
		
	}

}
