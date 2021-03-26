package com.yjs3509.cases.main;

import com.yjs3509.cases.domain.Outer;
import com.yjs3509.cases.domain.SubOuter;

public class Driver {

	public static void main(String[] args) {
		
//		Outer outer = new SubOuter();
//		outer.m();
		
		Outer outer = null;
		
		new SubOuter(outer);
	}
}
