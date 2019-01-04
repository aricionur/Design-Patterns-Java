package com.aricionur.patterns.facade;

public class Main {

	public static void main(String[] args) {
		
		SubClassOne subClassOne = new SubClassOne();
		SubClassTwo  subClassTwo = new SubClassTwo();
		SubClassThree subClassThree = new SubClassThree();
		
		FacadeClass facadeClass = new FacadeClass(subClassOne, subClassTwo, subClassThree);
		facadeClass.invokeRunMethods();
		facadeClass.invokeStopMethods();
		
	}

}
