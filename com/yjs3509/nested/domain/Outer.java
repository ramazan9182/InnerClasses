package com.yjs3509.nested.domain;

public class Outer {
	
	private int field;
	private static int staticField;
	
	
	static {
		System.out.println("Outer.Static");
	}
	
	public Outer() {
		System.out.println("Outer()");
	}
	
	public static class Nested{
		
		static {
			System.out.println("Nested.static");
		}
		
		public Nested() {
			System.out.println("Nested()");
			staticField = 56;
		}
		
//		public Outer getOuter() {
//			return Outer.this;
//		}
		
		public Outer getOuter() {
			return new Outer();
		}
		
		public int calculate() {
//			return field * 4;
			return staticField * 3;
		}
		
	}
	
}
