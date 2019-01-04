package com.aricionur.patterns.command;

public class ConcreteCommandDoMethodA implements Command {
	Receiver receiver;

	public ConcreteCommandDoMethodA(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.doMethodA();
	}

	@Override
	public void undo() {
		receiver.doMethodB();  //run other method on receiver
	}

}
