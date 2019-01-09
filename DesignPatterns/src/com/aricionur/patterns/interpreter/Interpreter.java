package com.aricionur.patterns.interpreter;

public class Interpreter {

	public void interpret(String formul) {
		Expression expression= parse(formul);
		expression.calculate();
	}
	
	public Expression parse(String formul) {
		if (formul.contains(OperationType.SUMMATION)) {
			return new SummationExpress(formul);
		}else if (formul.contains(OperationType.SUBTRACTION)) {
			return new SubstractionExpress(formul);
		}else if (formul.contains(OperationType.MULTIPLICATION)) {
			return new MultiplicationExpress(formul);
		}else if (formul.contains(OperationType.DIVISION)) {
			return new DivisionExpress(formul);
		}else { 
		return null;
		}
	}
	
}
