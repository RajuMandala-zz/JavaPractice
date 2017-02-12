package com.rajumandala.polymorphism;

class Vehicle {
	public void display() {
		System.out.println("I am Vehicle");
	}
}

class Bike extends Vehicle {
	@Override
	public void display() {
		System.out.println("I am Bike");
	}

	void bikeMethod() {
		System.out.println("I am specific to Bike");
	}
}

class Car extends Vehicle {
	@Override
	public void display() {
		System.out.println("I am Car");
	}
}

public class OverridingApp {
	public static void main(String[] args) {
		Vehicle vehicle = new Bike();
		vehicle.display();

		// The method bikeMethod() is undefined for the type Vehicle
		// vehicle.bikeMethod();
	}
}
