package com.aricionur.patterns.decorator;

public class ConcreteComponent implements Component {

	@Override
	public String methodA() {
		return "running ConcreteComponent methodA()";
	}

	@Override
	public String methodB() {
		return "running ConcreteComponent methodB()";
	}

}
