package com.aricionur.patterns.strategy.example;

public abstract class Character {

	WeaponBehavior weapon;
	
	public void setWeapon(WeaponBehavior weapon) {
		this.weapon = weapon;
	}
	
	public void fight() {
		this.weapon.useWeapon();
	}
}
