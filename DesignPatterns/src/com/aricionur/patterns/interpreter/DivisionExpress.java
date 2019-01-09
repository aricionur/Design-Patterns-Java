package com.aricionur.patterns.interpreter;

public class DivisionExpress extends Expression {

	public DivisionExpress(String formul) {
		int[] numbers = parse(formul);
		this.x = numbers[0];
		this.y = numbers[1];
		this.formul = formul;
	}

	private int[] parse(String formul) {

		String[] numbers = formul.split(OperationType.DIVISION);

		return new int[] { Integer.parseInt(numbers[0].trim()),
				Integer.parseInt(numbers[1].trim()) };
	}

	@Override
	public void calculate() {
		if (this.y != 0) {
			float result = (float) this.x / this.y;
			System.out.println(this.formul + " = " + result);
		} else {
			System.out.println("Zero division Error...");
		}

	}

}
