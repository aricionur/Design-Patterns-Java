package com.aricionur.patterns.singleton;

public class SingletonTypeThree {

	private volatile static SingletonTypeThree uniqueInstance;

	private SingletonTypeThree() {
	}

	// double-checked locking for threads
	public static SingletonTypeThree getInstance() {
		if (uniqueInstance == null) {
			synchronized (SingletonTypeThree.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new SingletonTypeThree();
				}
			}
		}
		return uniqueInstance;
	}

}
