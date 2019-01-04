package com.aricionur.patterns.templateMethod;

public class Main {

	public static void main(String[] args) {

		ConcreteClassOne concreteClassOne = new ConcreteClassOne();
		ConcreteClassTwo concreteClassTwo = new ConcreteClassTwo();

		System.out.println(" ---runing Template Method of Concrete Class One--- ");
		concreteClassOne.templateMethod();

		System.out.println(" ---runing Template Method of Concrete Class Two--- ");
		concreteClassTwo.templateMethod();

	}
}
