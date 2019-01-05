package com.aricionur.patterns.state;

public class ConcreteStateC implements State {

	Context context;
	
	public ConcreteStateC(Context context) {
		this.context = context;
	}

	@Override
	public void methodA() {
	}

	@Override
	public void methodB() {
	}

	@Override
	public void methodC() {
		System.out.println("running methodC of ConcreteStateC, " 
						  + "turning current currentState to ConcreteStateA");
		
		context.setCurrentState(context.getConcreteStateA());
	}

	public String toString() {
		return "This is concreteStateC !!! ";
	}
}
