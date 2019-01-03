package com.aricionur.patterns.strategy.example;

public class Knight extends Character{
	
	public Knight() {
		weapon = new KnifeBehavior();
	}
	
}
