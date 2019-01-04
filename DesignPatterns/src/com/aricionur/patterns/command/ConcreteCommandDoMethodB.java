package com.aricionur.patterns.command;

public class 
ConcreteCommandDoMethodB implements Command {
	Receiver receiver;

	public ConcreteCommandDoMethodB(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.doMethodB();
	}

	@Override
	public void undo() {
		receiver.doMethodA();  //run other method on receiver
		
	}
}
