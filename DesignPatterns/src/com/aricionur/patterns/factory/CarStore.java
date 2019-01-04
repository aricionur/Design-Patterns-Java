package com.aricionur.patterns.factory;

public abstract class CarStore {
	
	public Car orderCar(String model) {
		Car car;
		
		car = createCar(model); // --> factoryMethod()
		
		car.addThingsToCar();
		return car;
	}
	
	protected abstract Car createCar(String model); // --> factoryMethod()
	
	

}
