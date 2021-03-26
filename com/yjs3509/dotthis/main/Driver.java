package com.yjs3509.dotthis.main;

import com.yjs3509.dotthis.domain.Outer;

public class Driver {

	
	public static void main(String[] args) {
		Outer outer = new Outer();
		
		Outer.Inner inner = outer.getInner();
		
		Outer outer2 = inner.getOuter();
		
		Object object = inner.getOuter();
		
		
		outer.outerMethod();
	
		if(outer == outer2) {
			System.out.println("Yes it is same");
		}
	}
}
