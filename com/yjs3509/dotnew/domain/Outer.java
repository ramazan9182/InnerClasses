package com.yjs3509.dotnew.domain;

public class Outer {

	public class Inner{
		
		public Inner() {
			System.out.println("Inner()");
		}
		
		public void f() {
			System.out.println("Inner.f()");
		}
		
	}
}
