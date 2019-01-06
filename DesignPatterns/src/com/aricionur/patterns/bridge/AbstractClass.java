package com.aricionur.patterns.bridge;

public abstract class AbstractClass {

	Implementor implementor;
	
	public AbstractClass(Implementor implementor) {
		this.implementor = implementor;
	}

	public abstract void operation();
	
}
