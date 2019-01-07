package com.aricionur.patterns.chainOfResponsibility;

public class ConcreteHandlerTypeFour extends Handler{

	public ConcreteHandlerTypeFour() {
		requestType = RequestType.TypeFour;
	}
	
	public String toString() {
		return "ConcreteHandlerTypeFour";
	}

	public void doHandleMethod() {
		System.out.println("running" + this + "doHandleMethod() method...");
	}
	
}
