package com.aricionur.patterns.chainOfResponsibility;

public class ConcreteHandlerTypeThree extends Handler{

	public ConcreteHandlerTypeThree() {
		requestType = RequestType.TypeThree;
	}
	
	public String toString() {
		return "ConcreteHandlerTypeThree";
	}

	public void doHandleMethod() {
		System.out.println("running" + this + "doHandleMethod() method...");
	}
	
}
