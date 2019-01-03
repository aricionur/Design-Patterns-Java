package com.aricionur.patterns.strategy.example;

public class Main {

	public static void main(String[] args) {
		
		Character character = new King();
		character.fight();
		
		Character characterTwo = new Queen();
		characterTwo.fight();
		characterTwo.setWeapon(new SwordBehavior()); // dynamic change for behavior
		characterTwo.fight();

		Character characterThree = new Knight();
		characterThree.fight();
		characterThree.setWeapon(new AxeBehavior()); // dynamic change for behavior
		characterThree.fight();
		
		
		
		
	}
}
