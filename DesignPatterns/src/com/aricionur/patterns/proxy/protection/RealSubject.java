package com.aricionur.patterns.proxy.protection;

public class RealSubject implements Subject {

	@Override
	public void validMethodForOwner_One() {
		// TODO Auto-generated method stub
		System.out.println("\n--- running validMethodForOwner_One() method ---\n");
	}

	@Override
	public void validMethodForOwner_Two() {
		System.out.println("\n--- running validMethodForOwner_Two() method ---\n");
	}

	@Override
	public void nonValidMethodForOwner() {
		System.out.println("\n--- running nonValidMethodForOwner() method ---\n");
		
	}

}
