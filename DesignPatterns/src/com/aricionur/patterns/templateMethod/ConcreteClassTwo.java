package com.aricionur.patterns.templateMethod;

public class ConcreteClassTwo extends AbstractClass {

	@Override
	void doSpecificMethodOne() {
		System.out.println("running ConcreteClassTwo doSpecificMethodOne() ");
	}

	@Override
	void doSpecificMethodTwo() {
		System.out.println("running ConcreteClassTwo doSpecificMethodTwo() ");
		
	}
	
	@Override
	void doOptionalMethod() {
		System.out.println("running ConcreteClasstwo doOptionalMethod()");
	}

}
