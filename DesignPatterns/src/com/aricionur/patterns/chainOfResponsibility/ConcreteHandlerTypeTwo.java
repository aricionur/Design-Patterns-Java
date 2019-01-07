package com.aricionur.patterns.chainOfResponsibility;

public class ConcreteHandlerTypeTwo extends Handler{

	public ConcreteHandlerTypeTwo() {
		requestType = RequestType.TypeTwo;
	}
	
	public String toString() {
		return "ConcreteHandlerTypeTwo";
	}

	public void doHandleMethod() {
		System.out.println("running" + this + "doHandleMethod() method...");
	}
	
}
