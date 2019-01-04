package com.aricionur.patterns.decorator;

public class ConcreteDecoratorB implements Decorator {

	Component component;

	public ConcreteDecoratorB(Component component) {
		this.component = component;
	}

	@Override
	public String methodA() {
		return component.methodA() + ", running ConcreteDecoratorB methodA";
	}

	@Override
	public String methodB() {
		return component.methodB() + ", running ConcreteDecoratorB methodB";	
	}

}
