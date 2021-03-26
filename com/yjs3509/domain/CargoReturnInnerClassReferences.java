package com.yjs3509.domain;

public class CargoReturnInnerClassReferences {

	
	
	class Destination{
		private String to;
		
		public Destination(String to) {
			this.to = to;
			System.out.println("Destination()");
		}
		
		String getTo() {
			return to;
		}
	}
	
	
	public Destination getDestination(String to) {
		return new Destination(to);
	}
	
}
