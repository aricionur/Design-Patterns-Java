package com.aricionur.patterns.proxy;

public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println(" Running RealSubject request() method...");
	}
}
