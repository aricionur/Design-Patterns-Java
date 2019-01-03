package com.aricionur.patterns.strategy.example;

public class Queen extends Character {
	public Queen() {
		weapon = new AxeBehavior();
	}
}
