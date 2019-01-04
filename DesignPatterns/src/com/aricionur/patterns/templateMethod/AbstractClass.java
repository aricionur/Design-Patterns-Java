package com.aricionur.patterns.templateMethod;

public abstract class AbstractClass {
	
	final void templateMethod() {
		doCommonMethod();
		doSpecificMethodOne();
		doSpecificMethodTwo();
		doOptionalMethod();
	}
	
	final void doCommonMethod() {
		System.out.println("running doCommonMethod");
	}
	
	abstract void doSpecificMethodOne();
	abstract void doSpecificMethodTwo();
	
	void doOptionalMethod() {}
	
	

}
