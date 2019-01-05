package com.aricionur.patterns.Iterator;

public class ConcreteIteratorTwo implements Iterator {

	Item[] items;
	int position = 0;

	public ConcreteIteratorTwo(Item[] items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		Item item = items[position];
		position = position + 1;
		return item;
	}

}
