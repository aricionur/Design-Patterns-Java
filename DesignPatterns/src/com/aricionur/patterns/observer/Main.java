package com.aricionur.patterns.observer;

public class Main {
	
	public static void main(String[] args) {
		
		Observed observed = new ObservedImpl();
		
		Observer observerOne = new ObserverImpl(1);
		observerOne.subscribe(observed);
		
		Observer observerTwo = new ObserverImpl(2);
		observerTwo.subscribe(observed);
		
		observed.notifyObservers();
		
		observerTwo.unsubscibe();
		
		observed.notifyObservers();
		
	}

}
