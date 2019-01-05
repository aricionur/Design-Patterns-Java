package com.aricionur.patterns.state;

public class ConcreteStateB implements State {

	Context context;
	
	
	public ConcreteStateB(Context context) {
		this.context = context;
		
	}
	
	@Override
	public void methodA() {
	}

	@Override
	public void methodB() {
		System.out.println("running methodB of ConcreteStateB "
							+"turning current currentState to ConcreteStateC" );
		context.setCurrentState(context.getConcreteStateC());
	}

	@Override
	public void methodC() {		
	}
	public String toString() {
		return "This is concreteStateB !!! ";
	}

}
