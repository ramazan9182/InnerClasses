package com.yjs3509.cases.domain;

public class Outer {
	
	public Outer() {
		System.out.println("Outer()");
	}

	private A a  = new A();
	
	public class A{
		
		public A() {
			System.out.println("Outer.A()");
		}
		
		public void f() {
			System.out.println("Outer.A.f()");
		}
	}
	
	
	public void m() {
		a.f();
	}
	
	public void setA(A a) {
		this.a = a;
	}
}
