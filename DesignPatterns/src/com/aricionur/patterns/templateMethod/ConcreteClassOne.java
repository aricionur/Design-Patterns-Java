package com.aricionur.patterns.templateMethod;

public class ConcreteClassOne extends AbstractClass {

	@Override
	void doSpecificMethodOne() {
		System.out.println("running ConcreteClassOne doSpecificMethodOne() ");
	}

	@Override
	void doSpecificMethodTwo() {
		System.out.println("running ConcreteClassOne doSpecificMethodTwo() ");
		
	}

}
