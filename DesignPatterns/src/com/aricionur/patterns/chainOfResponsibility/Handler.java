package com.aricionur.patterns.chainOfResponsibility;

public abstract class Handler {

	Handler nextSuccesor;
	
	RequestType requestType;
	
	public abstract void doHandleMethod();
	
	public Handler setNextSuccesor(Handler nextSuccesor) {
		this.nextSuccesor = nextSuccesor;
		return this;
	}
	
	public Handler getNextSuccesor() {
		return nextSuccesor;
	}
	
	public void setRequestType(RequestType requestType) {
		this.requestType = requestType;
	}
	public RequestType getRequestType() {
		return requestType;
	}
		
	public void requestHandler(Handler succesor) {
		System.out.println("\ncurrent Concrete Handler is --> " + this);
		
		if (succesor.requestType != this.requestType ) {
			System.out.println("\nCurrent handler can't handle the request, passing next handler...");
			
			if(getNextSuccesor() != null) {
				getNextSuccesor().requestHandler(succesor);
			}else {
				System.out.println("\nEnd of the Chain. This Request is not proper for this chain");
			}	
		}else {
			succesor.doHandleMethod();
		}
		
	}
	
}
