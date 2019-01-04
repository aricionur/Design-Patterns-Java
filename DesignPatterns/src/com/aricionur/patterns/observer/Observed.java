package com.aricionur.patterns.observer;

public interface Observed {
	
	void registerObserver(Observer observer);
	
	void removeObserver(Observer observer);
	
	void notifyObservers();
}
