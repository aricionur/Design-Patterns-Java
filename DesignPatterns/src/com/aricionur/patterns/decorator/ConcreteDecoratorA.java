package com.aricionur.patterns.decorator;

public class ConcreteDecoratorA implements Decorator {

	Component component;
	
	public ConcreteDecoratorA(Component component) {
		this.component = component;
	}
	
	@Override
	public String methodA() {
		return component.methodA() + ", running ConcreteDecoratorA methodA";
	}

	@Override
	public String methodB() {
		return component.methodB() + ", running ConcreteDecoratorA methodB";
	}

}
