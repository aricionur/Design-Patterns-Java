package com.aricionur.patterns.observer;

import java.util.ArrayList;

public class ObservedImpl implements Observed {

	ArrayList<Observer> observers = new ArrayList<>();

	@Override
	public void registerObserver(Observer observer) {

		getObservers().add(observer);

	}

	@Override
	public void removeObserver(Observer observer) {
		getObservers().remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}

	}

	public void setObservers(ArrayList<Observer> observers) {
		this.observers = observers;
	}

	public ArrayList<Observer> getObservers() {
		return observers;
	}

}
