package com.rajumandala;
/*
 * Anonymous classes in Java are nested classes without a class name. 
 * They are typically declared as either subclasses of an existing class, or as implementations of some interface.
 */

class SuperClass {
	public void doIt() {
		System.out.println("SuperClass doIt()");
	}
}

interface MyInterface {
	public void doIt();
}

public class AnonymousClassApp {
	public static void main(String[] args) {
		SuperClass instance = new SuperClass() {
			public void doIt() {
				System.out.println("Extended Class: Anonymous class doIt()");
			}
		};

		instance.doIt();

		MyInterface instance2 = new MyInterface() {
			public void doIt() {
				System.out.println("Implemented Class: Anonymous class doIt()");
			}
		};

		instance2.doIt();
	}
}
