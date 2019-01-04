package com.aricionur.patterns.factory;

public class TypeTwoCarStore extends CarStore {

	@Override
	protected
	Car createCar(String model) {
		if (model.equals("modelOne")) {
			return new TypeOneModelOneCar();
		} else if (model.equals("modelTwo")) {
			return new TypeOneModelTwoCar();
		} else if (model.equals("modelThree")) {
			return new TypeOneModelThree();
		} else
			return null;
	}

}
