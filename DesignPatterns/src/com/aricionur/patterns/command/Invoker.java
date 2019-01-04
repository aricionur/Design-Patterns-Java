package com.aricionur.patterns.command;

public class Invoker {

	Command doMethodACommand;
	Command doMethodBCommand;
	Command undoCommand;
	
	void setCommand(Command doMethodACommand, Command doMethodBCommand) {
		this.doMethodACommand = doMethodACommand;
		this.doMethodBCommand = doMethodBCommand;
	}

	public void methodAWasInvoked() {
		doMethodACommand.execute();
		undoCommand = doMethodACommand; 	//store the last invoked command
	}

	public void methodBWasInvoked() {
		doMethodBCommand.execute();
		undoCommand = doMethodBCommand; 	//store the last invoked command
	}
	
	public void methodUndoWasInvoked() {
		undoCommand.undo();					// do last
	}
	
	
}
