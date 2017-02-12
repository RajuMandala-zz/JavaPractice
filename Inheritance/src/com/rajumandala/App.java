package com.rajumandala;

class A {
	public void add() {
		System.out.println("A");
	}
}
class B extends A {
	/*public void add() {
		System.out.println("B");
	}*/
}
class C extends B {
	public void add() {
		System.out.println("C");
	}
}
public class App {
	public static void main(String[] args) {
		A a = new B();
		a.add();
		
		B b = new B();
		b.add();
	}
}
