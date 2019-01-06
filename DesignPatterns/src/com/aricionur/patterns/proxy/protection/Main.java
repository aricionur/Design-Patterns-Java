package com.aricionur.patterns.proxy.protection;

import java.lang.reflect.Proxy;

public class Main {

	public static void main(String[] args) {

		Main test = new Main();
		test.drive();
	}

	public void drive() {
		Subject realSubject = new RealSubject();
		Subject ownerProxy = getOwnerProxy(realSubject);

		System.out.println("trying to run validMethodForOwner_One() of RealSubject via ownerProxy... ");
		ownerProxy.validMethodForOwner_One();

		System.out.println("trying to run validMethodForOwner_Two() of RealSubject via ownerProxy... ");
		ownerProxy.validMethodForOwner_Two();

		try {
			System.out.println("trying to run nonValidMethodForOwner_One() of RealSubject via ownerProxy...");
			ownerProxy.nonValidMethodForOwner();
		} catch (Exception e) {
			System.out.println("Can't run nonValidMethodForOwner() method");
		}

		Subject nonOwnerProxy = getNonOwnerProxy(realSubject);

		try {
			System.out.println("trying to run validMethodForOwner_One() of RealSubject via nonOwnerProxy... ");
			nonOwnerProxy.validMethodForOwner_One();
		} catch (Exception e) {
			System.out.println("System.out.println(\"Can't run validMethodForOwner_One() method ");
		}

		try {
			System.out.println("trying to run validMethodForOwner_Two() of RealSubject via nonOwnerProxy... ");
			nonOwnerProxy.validMethodForOwner_Two();
		} catch (Exception e) {
			System.out.println("System.out.println(\"Can't run validMethodForOwner_Two() method");
		}

		System.out.println("trying to run nonValidMethodForOwner_One() of RealSubject via nonOwnerProxy...");
		nonOwnerProxy.nonValidMethodForOwner();

	}

	Subject getOwnerProxy(Subject subject) {
		return (Subject) Proxy.newProxyInstance(
				subject.getClass().getClassLoader(),
				subject.getClass().getInterfaces(),
				new OwnerInvocationHandlerImpl(subject));
	}

	Subject getNonOwnerProxy(Subject subject) {
		return (Subject) Proxy.newProxyInstance(
				subject.getClass().getClassLoader(),
				subject.getClass().getInterfaces(),
				new NonOwnerInvocationHandlerImpl(subject));
	}
}
