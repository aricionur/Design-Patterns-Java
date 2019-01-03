package com.aricionur.patterns.strategy.example;

public class King extends Character {

	public King() {
		weapon = new SwordBehavior();
	}


}
