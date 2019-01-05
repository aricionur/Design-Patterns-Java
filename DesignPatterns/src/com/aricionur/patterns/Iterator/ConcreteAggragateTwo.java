package com.aricionur.patterns.Iterator;

public class ConcreteAggragateTwo implements Aggragate {

	int lengthOfArray = 5;
	int position = 0;
	Item[] items;
	
	
	public ConcreteAggragateTwo() {
		items = new Item[lengthOfArray];
		
		addItem(1, "Array[]_itemOne");
		addItem(2, "Array[]_itemTWO");
		addItem(3, "Array[]_itemThree");
		addItem(4, "Array[]_itemFour");
		addItem(5, "Array[]_itemFour");
		
	}
	
	
	public void addItem(int id , String description) {
		
		Item item = new Item(id, description);
		items[position] = item;
		position= position + 1;
	}
	
	public Iterator createIterator() {
		return new ConcreteIteratorTwo(items);
	}
	
	
	
}
