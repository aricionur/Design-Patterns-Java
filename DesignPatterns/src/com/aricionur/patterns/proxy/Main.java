package com.aricionur.patterns.proxy;

public class Main {

	public static void main(String[] args) {
		
		Subject subject = new SubjectProxy();
		subject.request();
		
	}
	
}
