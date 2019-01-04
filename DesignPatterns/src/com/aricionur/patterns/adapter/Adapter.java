package com.aricionur.patterns.adapter;

public class Adapter implements TargetInterface {
	Adaptee adaptee = new Adaptee();
	
	public Adapter(Adaptee adaptee) {
	this.adaptee = adaptee;
	}
	
	@Override
	public void doRequest() {
		adaptee.doSpecificRequest();
	}
	
	

}
