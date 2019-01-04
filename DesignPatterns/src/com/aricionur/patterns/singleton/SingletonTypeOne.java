package com.aricionur.patterns.singleton;

public class SingletonTypeOne {
	
	// eagerly created singleton object
	private static SingletonTypeOne uniqueInstance = new SingletonTypeOne();
	
	private SingletonTypeOne() {}
	
	public SingletonTypeOne getInstance() {
		return uniqueInstance;
	}

}
