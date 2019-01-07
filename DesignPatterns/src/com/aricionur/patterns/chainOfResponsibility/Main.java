package com.aricionur.patterns.chainOfResponsibility;

public class Main {
	
	
//	private static Handler chain  = null;
	public static void main(String[] args) {
		
	
	
	 Handler chain = (new ConcreteHandlerTypeOne()).setNextSuccesor((new ConcreteHandlerTypeTwo()).setNextSuccesor(new ConcreteHandlerTypeThree()));
	
	 chain.requestHandler(new ConcreteHandlerTypeOne());
	 chain.requestHandler(new ConcreteHandlerTypeTwo());
	 chain.requestHandler(new ConcreteHandlerTypeThree());
	 chain.requestHandler(new ConcreteHandlerTypeFour());
	 
	 
	 
	 
	}				
	

}
