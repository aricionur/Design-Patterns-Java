package com.aricionur.patterns.interpreter;

public class SubstractionExpress extends Expression{

	public SubstractionExpress(String formul) {
		int [] numbers = parse(formul);
		this.x = numbers[0];
		this.y = numbers[1];
		this.formul = formul;
	}
	
	private int[] parse(String formul) {
		
		String[] numbers = formul.split(OperationType.SUBTRACTION);
		
		return new int[] {Integer.parseInt(numbers[0].trim()),
				Integer.parseInt(numbers[1].trim())};
	}
	
	@Override
	public void calculate() {
		System.out.println(this.formul + " = " + (this.x - this.y));
		
		
	}

}
