package com.rajumandala.inheritance;

import java.util.List;

class Vehicle {
	private int id;
	private String name;
	
	public Vehicle(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + "]";
	}	
}

class Bike extends Vehicle {
	private boolean hasDisk;
	public Bike(int id, String name, boolean hasDisk) {
		super(id, name);
		this.hasDisk = hasDisk;
	}
	public boolean isHasDisk() {
		return hasDisk;
	}
	public void setHasDisk(boolean hasDisk) {
		this.hasDisk = hasDisk;
	}
	@Override
	public String toString() {
		return "Bike [hasDisk=" + hasDisk + "]";
	}	
}

class Car extends Vehicle {
	private boolean hasABS;
	public Car(int id, String name, boolean hasABS) {
		super(id, name);
		this.hasABS = hasABS;
	}
	public boolean isHasABS() {
		return hasABS;
	}
	public void setHasABS(boolean hasABS) {
		this.hasABS = hasABS;
	}
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static void display(Vehicle vehicle) {
		System.out.println(vehicle.toString());
	}
	
	private static void displyVehicles(List<Vehicle> vehicles) {
		
	}

}
