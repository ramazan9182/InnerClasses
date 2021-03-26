package com.yjs3509.cases.domain;

public class SubOuter extends Outer.A{
	
	public SubOuter(Outer outer) {
		outer.super();
		
		System.out.println("SubOuter()");
//		setA(new A());
	}

	
//	public class A extends Outer.A{
//		
//		public A() {
//			System.out.println("SubOuter.A()");
//		}
//		
//		@Override
//		public void f() {
//			System.out.println("SubOuter.A.f()");
//		}
//	}
}
