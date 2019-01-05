package com.aricionur.patterns.state;

public class ConcreteStateA implements State {

	Context context;
	
	
	public ConcreteStateA(Context context) {
		this.context = context;
	}

	@Override
	public void methodA() {
		System.out.println("running methodA of ConcreteStateA, " 
							+ "turning currentState to ConcreteStateB");
	context.setCurrentState(context.getConcreteStateB());

	}

	@Override
	public void methodB() {
		System.out.println("running handleMethodB of ConcreteStateA ");

	}

	@Override
	public void methodC() {
		
	}
	
	public String toString() {
		return "This is concreteStateA !!!";
	}

}
