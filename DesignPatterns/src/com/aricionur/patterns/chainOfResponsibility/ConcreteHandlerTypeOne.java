package com.aricionur.patterns.chainOfResponsibility;

public class ConcreteHandlerTypeOne extends Handler{

	public ConcreteHandlerTypeOne() {
		requestType = RequestType.TypeOne;
	}
	
	public String toString() {
		return "ConcreteHandlerTypeOne";
	}

	public void doHandleMethod() {
		System.out.println("running" + this + "doHandleMethod() method...");
	}
	
}
