package com.yjs3509.annonymous.domain;

public class Cargo {

	private String destinationName;
	
	public Destination getDestination(String destination) {
		
		return new Destination() {
			private String to;
			
			{
				this.to = destination;
				System.out.println("Annonymous Class Constructor");
			}
			
			@Override
			public String to() {
				return this.to;
			}
			
		};
		
	}
	
	
	
	public AbstractDestination getAbstractDestination(int distanceInKM) {
		
		return new AbstractDestination(distanceInKM) {
			
			private int field;

			{
				
			}
			
			@Override
			public String getTo() {
				return null;
			}
		};
		
	}
}
