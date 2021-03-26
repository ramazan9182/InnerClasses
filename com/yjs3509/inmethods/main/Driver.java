package com.yjs3509.inmethods.main;

import com.yjs3509.inmethods.domain.Cargo;
import com.yjs3509.inmethods.domain.Destination;

public class Driver {

	public static void main(String[] args) {
		
		Cargo cargo = new Cargo();
//		Destination destination = cargo.getDestination();
//		System.out.println(destination.to());
		
		cargo.getDestination();
		
	}
}
