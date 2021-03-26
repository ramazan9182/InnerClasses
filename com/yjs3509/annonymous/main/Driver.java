package com.yjs3509.annonymous.main;

import com.yjs3509.annonymous.domain.Cargo;

public class Driver {

	
	public static void main(String[] args) {
		
		
		Cargo cargo = new Cargo();
		System.out.println(cargo.getDestination("Istanbul").to());
		
		
	}
}
