package com.aricionur.patterns.bridge;

public class AbstractClassImpl extends AbstractClass{

	public AbstractClassImpl(Implementor implementor) {
	super(implementor);
	}
	
	@Override
	public void operation() {
		implementor.operationImpl();
		
	}

}
