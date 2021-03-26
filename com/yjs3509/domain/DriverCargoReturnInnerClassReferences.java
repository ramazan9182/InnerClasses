package com.yjs3509.domain;


public class DriverCargoReturnInnerClassReferences {
	
	public static void main(String[] args) {
		
		// Full Qualified Named Class ===>  javax.print.attribute.standard.Destination
		
		CargoReturnInnerClassReferences.Destination destination = new CargoReturnInnerClassReferences().getDestination("Istanbul");
		System.out.println(destination.getTo());
		
	}
}
