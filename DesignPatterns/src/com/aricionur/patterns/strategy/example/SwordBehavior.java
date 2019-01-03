package com.aricionur.patterns.strategy.example;

public class SwordBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("swinging a sword...");
	}

}
