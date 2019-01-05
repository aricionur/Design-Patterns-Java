package com.aricionur.patterns.Iterator;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
		Aggragate aggragateOne = new ConcreteAggragate();
		Aggragate aggragateTwo = new ConcreteAggragateTwo();
		
		Client client = new Client(aggragateOne,aggragateTwo);
		client.printItems();
		
		
	}
}
