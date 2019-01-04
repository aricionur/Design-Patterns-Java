package com.aricionur.patterns.adapter;

import javax.management.remote.TargetedNotification;

public class Main {

	public static void main(String[] args) {

		TargetInterfaceImpl targetInterfaceImpl = new TargetInterfaceImpl();

		Adaptee adaptee = new Adaptee();

		TargetInterface adapter = new Adapter(adaptee);

		System.out.println("---do targetInterfaceImpl Request");
		targetInterfaceImpl.doRequest();

		System.out.println("---do Adaptee Specific Request---");
		adaptee.doSpecificRequest();

		System.out.println("--- test Adapter class---");
		testAdapter(adapter);

	}

	static void testAdapter(TargetInterface targetInterface) {
		targetInterface.doRequest();
	}

}
