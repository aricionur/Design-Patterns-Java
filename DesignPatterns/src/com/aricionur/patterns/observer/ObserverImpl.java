package com.aricionur.patterns.observer;

public class ObserverImpl implements Observer {

	Observed observed;
	int id;

	public ObserverImpl(int id) {
		this.id = id;
	}

	@Override
	public void update() {

		System.out.println("Observer (ID:"+id+") has updated.");

	}

	@Override
	public void subscribe(Observed observed) {
		setObserved(observed);
		observed.registerObserver(this);
		System.out.println("Observer (ID:"+id+") has subscribed. ");

	}

	@Override
	public void unsubscibe() {
		getObserved().removeObserver(this) ;
		System.out.println("Observer(ID:"+id+") has unsubscribed. ");

	}

	public void setObserved(Observed observed) {
		this.observed = observed;
	}

	public Observed getObserved() {
		return observed;
	}

}
