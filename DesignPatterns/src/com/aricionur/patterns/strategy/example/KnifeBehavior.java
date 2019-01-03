package com.aricionur.patterns.strategy.example;

public class KnifeBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("cutting with a knife...");
	}

}
