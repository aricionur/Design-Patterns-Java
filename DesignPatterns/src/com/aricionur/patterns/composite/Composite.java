package com.aricionur.patterns.composite;

import java.util.ArrayList;
import java.util.Iterator;



public class Composite extends Component {

	ArrayList components = new ArrayList<>();
	String description;

	public Composite(String description) {
		this.description = description;
	}
	
	public void add(Component component) {
		components.add(component);
	}
	public void remove(Component component) {
		component.remove(component);
	}

	public Component getChild(int i) {
		return (Component) components.get(i);
	}
	
	public String getDescription() {
		return description;
	}
	public void print() {
		System.out.println(getDescription());
		
		Iterator iterator = components.iterator();
		while(iterator.hasNext()) {
			Component component = (Component) iterator.next();
			component.print();
		}
		
	}
}
