package com.aricionur.patterns.observer;

public interface Observer {

	void update();
	void subscribe(Observed observed);
	void unsubscibe();
}
