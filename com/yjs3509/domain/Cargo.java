package com.yjs3509.domain;

public class Cargo {
	
	
	public Cargo() {
		System.out.println("Cargo()");
	}
	
	class Destination{
		
		private  String to;
		
		public Destination() {
			System.out.println("Destination()");
		}
		
		public Destination(String to) {
			this.to = to;
			System.out.println("Destination()");
		}
		
		String getTo() {
			return to;
		}
		
	}
	
	public void ship(String to) {
		Destination destination = new Destination(to);
		System.out.println("Cargo is shipping to " + destination.getTo());
	}

}
