package com.yjs3509.dotnew.main;

import com.yjs3509.dotnew.domain.Outer;

public class Driver {

	
	public static void main(String[] args) {
		
		Outer outer = new Outer();
		
		Outer.Inner inner = outer.new Inner();
		inner.f();
		
	}
}
