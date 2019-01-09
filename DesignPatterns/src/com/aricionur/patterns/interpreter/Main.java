package com.aricionur.patterns.interpreter;

public class Main {
	
	public static void main(String[] args) {
		Interpreter interpreter = new Interpreter();
		
		String formul = "2 plus 3";
		interpreter.interpret(formul);
		
		String formulTwo = "2 minus 3";
		interpreter.interpret(formulTwo);
		
		String formulThree = "2 multiply 3";
		interpreter.interpret(formulThree);
		
		String formulFour = "2 divide 3";
		interpreter.interpret(formulFour);
		
		
	}

}
