package com.aricionur.patterns.strategy.example;

public class AxeBehavior implements WeaponBehavior{

	@Override
	public void useWeapon() {
		System.out.println("chopping with an axe...");
	}

}
