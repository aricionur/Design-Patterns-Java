package com.aricionur.patterns.Iterator;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
		ConcreteAggragate aggragateOne = new ConcreteAggragate();
		ConcreteAggragateTwo aggragateTwo = new ConcreteAggragateTwo();
		
		Client client = new Client(aggragateOne,aggragateTwo);
		client.printItems();
		
		
	}
}
