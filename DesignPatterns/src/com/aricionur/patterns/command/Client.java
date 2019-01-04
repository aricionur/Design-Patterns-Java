package com.aricionur.patterns.command;

public class Client {

	public static void main(String[] args) {

		Invoker invoker = new Invoker();

		Receiver receiver = new Receiver();
		
		

		ConcreteCommandDoMethodA doMethodACommand = new ConcreteCommandDoMethodA(receiver);
		ConcreteCommandDoMethodB doMethodBCommand = new ConcreteCommandDoMethodB(receiver);
		
		invoker.setCommand(doMethodACommand, doMethodBCommand);
		
		invoker.methodAWasInvoked();
		invoker.methodBWasInvoked();
		
		System.out.println("\n  ---do undo operations---");
		
		invoker.methodAWasInvoked();
		invoker.methodUndoWasInvoked();
		
		System.out.println("\n");
		
		invoker.methodBWasInvoked();
		invoker.methodUndoWasInvoked();
		
		
		
		
		
		
		
		
	}

}
