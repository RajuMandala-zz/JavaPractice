package com.rajumandala;

/*
 * Being static, a static nested class can only access instance variables of the enclosing class via a reference to an instance of the enclosing class.
 */
class Outer {
	public static class Nested {

	}
}
public class StaticNestedClassApp {
	public static void main(String[] args) {
		Outer.Nested nested = new Outer.Nested();
	}
}
