package com.aricionur.patterns.composite;

public class Main {

	public static void main(String[] args) {

		Component compositeOne = new Composite(" CompositeOne");
		Component compositeTwo = new Composite(" CompositeTwo");
		Component compositeThree = new Composite(" CompositeThree");
		Component compositeFour = new Composite(" CompositeFour");

		Component headComposite = new Composite(" HeadComposite");
		headComposite.add(compositeOne);
		headComposite.add(compositeTwo);
		headComposite.add(compositeThree);

		// add Leafs to Composites
		compositeOne.add(new Leaf(" LeafOneOfCompositeOne"));
		compositeOne.add(new Leaf(" LeafTwoOfCompositeOne"));
		compositeOne.add(compositeFour);

		compositeFour.add(new Leaf(" LeafOneOfCompositeFour"));

		Client client = new Client(headComposite);
		client.printComponents();

	}

}
