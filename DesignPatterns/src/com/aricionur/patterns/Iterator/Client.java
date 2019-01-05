package com.aricionur.patterns.Iterator;

public class Client {

	Aggragate aggragateOne;
	Aggragate aggragateTwo;

	public Client(Aggragate aggragateOne, Aggragate aggragateTwo) {
		this.aggragateOne = aggragateOne;
		this.aggragateTwo = aggragateTwo;
	}
	
	public void printItems() {
		Iterator concreteIterator = aggragateOne.createIterator();
		printItem(concreteIterator);
		
		Iterator concreteIteratorTwo = aggragateTwo.createIterator();
		printItem(concreteIteratorTwo);
		
	}

	private void printItem(Iterator iterator) {
		System.out.println("writing aggragets in a comman loop");
		while(iterator.hasNext()) {
			Item item = (Item) iterator.next(); // has to do a casting operation because return type is a Object class object
			System.out.println("Id : " + item.id + " description : " + item.description);
		}

	}
}
