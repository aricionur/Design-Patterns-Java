package com.aricionur.patterns.decorator;

public class Main {

	public static void main(String[] args) {
		
		Component component = new ConcreteComponent();
		System.out.println("run methods: \n" + component.methodA() +
				"\n" + component.methodB());
		
		
		
		Component component2 = new ConcreteComponent();
		component2 = new ConcreteDecoratorA(component2);
		component2 = new ConcreteDecoratorB(component2);
		System.out.println("run methods: \n" + component2.methodA() + "\n" + component2.methodB());

		
		
	}
}
