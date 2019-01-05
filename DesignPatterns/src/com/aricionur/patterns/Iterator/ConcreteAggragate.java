package com.aricionur.patterns.Iterator;

import java.util.ArrayList;

public class ConcreteAggragate implements Aggragate {

	ArrayList items;
	
	public ConcreteAggragate() {
		items = new ArrayList<>();
		
		addItem(1, "ArrayList<>_itemOne");
		addItem(2, "ArrayList<>_itemTwo");
		addItem(3, "ArrayList<>_itemThree");
		addItem(4, "ArrayList<>_itemFour");
	}
	
	public void addItem(int id, String name) {
		Item item = new Item(id,name);
		items.add(item);
	}
	
	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(items);
	}
	

	
	
}
