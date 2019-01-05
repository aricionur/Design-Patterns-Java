package com.aricionur.patterns.Iterator;

import java.util.ArrayList;

public class ConcreteIterator implements Iterator {

	ArrayList<Item> items;
	int position = 0;

	public ConcreteIterator(ArrayList<Item> items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (position >= items.size() || items.get(position) == null) {
			return false;
		} else {
			return true;
		}

	}

	@Override
	public Object next() {
		Item item = items.get(position);
		position = position + 1;
		return item;
	}

}
