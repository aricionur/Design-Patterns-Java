package com.aricionur.patterns.composite;

public class Leaf extends Component {

	String description;

	public Leaf(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void print() {
		System.out.println(getDescription());
	}
}
