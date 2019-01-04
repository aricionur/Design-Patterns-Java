package com.aricionur.patterns.facade;

public class FacadeClass {

	SubClassOne subClassOne;
	SubClassTwo subClassTwo;
	SubClassThree subClassThree;
	
	public FacadeClass(
			SubClassOne subClassOne,
			SubClassTwo subClassTwo,
			SubClassThree subClassThree) {
		
		this.subClassOne = subClassOne;
		this.subClassTwo = subClassTwo;
		this.subClassThree = subClassThree;
	}
	
	public void invokeRunMethods() {
		System.out.println("--- invoking Run Methods ---");
		subClassOne.doRunMethod();
		subClassTwo.doRunMethod();
		subClassThree.doRunMethod();
	}
	
	public void invokeStopMethods() {
		System.out.println("--- invoking Stop Methods ---");
		subClassOne.doStopMethod();
		subClassTwo.doStopMethod();
		subClassThree.doStopMethod();
	}
}
