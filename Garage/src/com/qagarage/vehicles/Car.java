package com.qagarage.vehicles;

public class Car extends Vehicle {
	
	protected int doors;
	protected double mpg;
	protected boolean automaticTransmission;
	
	public Car() {
		super();
		this.doors = 4;
		this.mpg = 1;
		this.automaticTransmission = true;
	}
	
	public Car(String make, String model, String color, int year, double tankLevel, double tankCapacity, double miles, int doors, double mpg, boolean autoTrans) {
		super(make, model, year, color, tankLevel, tankCapacity, miles);
		this.doors = doors;
		this.mpg = mpg;
		this.automaticTransmission = autoTrans;
	}
	
	public int doors() {
		return this.doors;
	}
	
	public double mpg() {
		return this.mpg;
	}
	
	public String transmission() {
		if (this.automaticTransmission) {
			return "automatic";
		} else {
			return "manual";
		}
	}
	
	public void setDoors(int newDoors) {
		this.doors = newDoors;
	}
	
	public void setMpg(double newMpg) {
		this.mpg = newMpg;
	}
	
	public void setTransmission(String newTrans) {
		String nt = newTrans.toLowerCase();
		if (nt != "automatic" && nt != "manual") {
			System.out.println("invalid input, must either set transmission to \"manual\" or \"automatic\"");
		} else {
			if (nt == "automatic") {
				this.automaticTransmission = true;
			} else {
				this.automaticTransmission = false;
			}
		}
	}
	

	@Override
	public void drive(double numOfMiles) {
		double gasNeeded = numOfMiles * this.mpg;
		double longestDistance = this.tankLevel / this.mpg;
		if (gasNeeded > this.tankLevel) {
			System.out.println("Not enough gas in tank. Either put gas in tank or take a shorter trip. \n The longest distance you can travel is " + longestDistance + " miles");
		} else {
			this.tankLevel -= gasNeeded;
			this.miles += numOfMiles;
			System.out.println("You drove " + numOfMiles + " miles\n" + "Gas used: " + gasNeeded + "gallons\n" + "gas remaining: " + (this.tankCapacity - this.tankLevel) + " gallons\n" + "Odometer: " + this.miles);
		}
		
	}

	@Override
	public void fillTank(boolean fillTillFull) {
		this.tankLevel = this.tankCapacity;
		System.out.println("Tank is now filled");
	}

	@Override
	public void fillTank(double amountToFill) {
		double newTotalAmt = amountToFill + this.tankLevel;
		if (newTotalAmt > this.tankCapacity) {
			System.out.println("Can't put in that much gas, the tank would overfill\n The most you can put in the tank right now is " + (this.tankCapacity - this.tankLevel) + " gallons");
		}
	}

}
