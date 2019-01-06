package com.aricionur.patterns.proxy.virtual;

public class SubjectProxy implements Subject{

	RealSubject realSubject ;
	
	
	@Override
	public void request() {
		
		System.out.println(" Running SubjetcProxy request() method...");
		if(realSubject != null) {
			System.out.println(" RealSubject object is --> NOT NULL and running RealSubject request() method");
			realSubject.request();
		}else {
			System.out.println(" RealSubject object is --> NULL and creating RealSubject object !!! ");
			realSubject = new RealSubject();
			
			System.out.println(" New RealSubject object is created and re-calling the SubjectProxy request() method");
			request();
		}
	}
	
	

}
