package com.aricionur.patterns.state;

public class Context {

	State concreteStateA;
	State concreteStateB;
	State concreteStateC;

	State currentState;

	public Context() {
		concreteStateA = new ConcreteStateA(this);
		concreteStateB = new ConcreteStateB(this);
		concreteStateC = new ConcreteStateC(this);
		currentState = concreteStateA;
	}

	public void methodA() {
		currentState.methodA();
	}

	public void methodB() {
		currentState.methodB();
	}

	public void methodC() {
		currentState.methodC();
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

	public State getCurrentState() {
		return currentState;
	}

	public State getConcreteStateA() {
		return concreteStateA;
	}

	public State getConcreteStateB() {
		return concreteStateB;
	}

	public State getConcreteStateC() {
		return concreteStateC;
	}

}
