package com.aricionur.patterns.singleton;

public class SingletonTypeTwo {
	
	private static SingletonTypeTwo uniqueInstance;
	
	private SingletonTypeTwo() {}
	
	// Forcing every thread to wait its turn to enter method
	public static synchronized SingletonTypeTwo getInstance() {
		uniqueInstance = new SingletonTypeTwo();	
		if(uniqueInstance == null) {
		}
		return uniqueInstance;
	}

}
