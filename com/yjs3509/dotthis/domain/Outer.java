package com.yjs3509.dotthis.domain;

public class Outer {
	
	public class Inner{
		
		public Outer getOuter() {
			return Outer.this;
		}
		
	}
	
	public Inner getInner() {
		return new Inner();
	}
	
	public void outerMethod() {
		System.out.println("outermethod()");
	}
}
