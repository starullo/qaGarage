package com.qagarage.vehicles;

public abstract class Vehicle implements VehicleDriving  {
	
	protected String make;
	protected String model;
	protected int year;
	protected String color;
	protected double tankLevel;
	protected double tankCapacity;
	protected double miles;
	protected double mpg;

	public Vehicle() {
		this.make = "???";
		this.model = "???";
		this.year = 0;
		this.color = "???";
		this.tankLevel = 0.0;
		this.tankCapacity = 0.0;
		this.miles = 0.0;
		this.mpg = 0.0;
	}
	
	public Vehicle(String make, String model, String color, int year, double tankLevel, double tankCapacity, double miles, double mpg) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		this.tankLevel = tankLevel;
		this.tankCapacity = tankCapacity;
		this.miles = miles;
		this.mpg = mpg;
	}
	
	public String make() {
		return this.make;
	}
	
	public String model() {
		return this.model;
	}
	
	public int year() {
		return this.year;
	}
	
	public String color() {
		return this.color;
	}
	
	public double tankLevel() {
		return this.tankLevel;
	}
	
	public double tankCapacity() {
		return this.tankCapacity;
	}
	
	public double miles() {
		return this.miles;
	}
	
	public double mpg() {
		return this.mpg;
	}
	
	public void setMake(String newMake) {
		this.make = newMake;
	}
	
	public void setModel(String newModel) {
		this.model = newModel;
	}
	
	public void setYear(int newYear) {
		this.year = newYear;
	}
	
	public void setColor(String newColor) {
		this.color = newColor;
	}
	
	public void setTankLevel(double newTl) {
		this.tankLevel = newTl;
	}
	
	public void setTankCapacity(double newTc) {
		this.tankCapacity = newTc;
	}
	
	public void setMiles(double newMiles) {
		this.miles = newMiles;
	}
	
	public void setMpg(double newMpg) {
		this.mpg = newMpg;
	}

}
