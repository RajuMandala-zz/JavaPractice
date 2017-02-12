package com.rajumandala.polymorphism;

/*
 * Method overloading can't be performed by changing return type of the method only. 
 * Return type can be same or different in method overloading. But you must have to change the parameter.
 */
class Example {
	int add(int a, int b) {
		return a+b;
	}
	// Duplicate method
	/*long add(int a, int b) {
		return a+b;
	}*/
	
	int add(int a, int b, int c) {
		return a+b+c;
	}
	
	long add(long a, long b) {
		return a + b;
	}
	
	
	long mul(int a, long b) {
		return a * b;
	}
	long mul(long a, int b) {
		return a * b;
	}
}

public class OverloadingApp {
	public static void main(String[] args) {
		Example a = new Example();
		System.out.println(a.add(1, 2));
		System.out.println(a.add(1, 2, 3));
		
		//the method mul is ambiguous
		//System.out.println(a.mul(2, 5));
	}
}
