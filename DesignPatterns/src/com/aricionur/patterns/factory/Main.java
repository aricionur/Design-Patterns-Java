package com.aricionur.patterns.factory;

public class Main {
	
	public static void main(String[] args) {
		
		CarStore typeOneCarStore = new TypeOneCarStore(); 
		CarStore typeTwoCarStore = new TypeTwoCarStore();
		
		Car car = typeOneCarStore.orderCar("modelOne");
		System.out.println("Ordered car name : " + car.name);
		
		car=typeOneCarStore.orderCar("modelTwo");
		System.out.println("Ordered car name : " + car.name);
		
		car=typeOneCarStore.orderCar("modelThree");
		System.out.println("Ordered car name : " + car.name);
		
		System.out.println("------------------------------");
		
		car=typeTwoCarStore.orderCar("modelOne");
		System.out.println("Ordered car name : " + car.name);
		
		car=typeTwoCarStore.orderCar("modelTwo");
		System.out.println("Ordered car name : " + car.name);
		
		car=typeTwoCarStore.orderCar("modelThree");
		System.out.println("Ordered car name : " + car.name);
		
		
	}

}
