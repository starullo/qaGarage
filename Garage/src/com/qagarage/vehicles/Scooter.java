package com.qagarage.vehicles;

public class Scooter extends Vehicle {
	
	protected char kickstandLocation;
	protected boolean hasBasket;

	public Scooter() {
		super();
		this.kickstandLocation = 'L';
		this.hasBasket = true;
	}
	
	public Scooter(String make, String model, String color, int year, double tankLevel, double tankCapacity, double miles, double mpg) {
		super(make, model, color, year, tankLevel, tankCapacity, miles, mpg);
		this.kickstandLocation = 'L';
		this.hasBasket = true;
	}
	
	public Scooter(String make, String model, String color, int year, double tankLevel, double tankCapacity, double miles, double mpg, boolean hasBasket, char kickstandLocation) {
		super(make, model, color, year, tankLevel, tankCapacity, miles, mpg);
		char kl;
		if (kickstandLocation != 'l' && kickstandLocation != 'r' && kickstandLocation != 'R' && kickstandLocation != 'L') {
			kl = 'L';
		} else {
			kl = kickstandLocation;
		}
		this.kickstandLocation = kl;
		this.hasBasket = hasBasket;
	}
	
	public Scooter(String make, String model, String color, int year, double tankLevel, double tankCapacity, double miles, double mpg, boolean hasBasket) {
		super(make, model, color, year, tankLevel, tankCapacity, miles, mpg);
		this.kickstandLocation = 'L';
		this.hasBasket = hasBasket;
	}
	
	public String kickstandLocation() {
		if (this.kickstandLocation == 'l' || this.kickstandLocation == 'L') {
			return "LEFT";
		} else {
			return "RIGHT";
		}
	}
	
	public boolean hasBasket() {
		return this.hasBasket;
	}
	
	public void setKickstandLocation(char newKSL) {
		if (newKSL != 'l' && newKSL != 'r' && newKSL != 'L' && newKSL != 'R') {
			System.out.println("Must insert either \"L\" or \"R\" (for left or right side)");
		} else {
			if (this.kickstandLocation == 'l' || this.kickstandLocation == 'L') {
				if (newKSL == 'l' || newKSL == 'L') {
					System.out.println("Kickstand already on left side");
				} else {
					this.kickstandLocation = 'L';
					System.out.println("Kickstand moved to left side");
				}
			} else {
				if (newKSL == 'r' || newKSL == 'R') {
					System.out.println("Kickstand already on right side");
				} else {
					this.kickstandLocation = 'R';
					System.out.println("Kickstand moved to right side");
				}
			}
		}
	}
	
	public void setKickstandLocation(String newKSL) {
		if (newKSL.toLowerCase() != "r" && newKSL != "l") {
			System.out.println("Must insert either \"L\" or \"R\" (for left or right side)");
		}
		else {
			this.kickstandLocation = newKSL.charAt(0);
			System.out.println();
		}
	}
	
	public void setHasBasket(boolean newHasBasket) {
		if (newHasBasket) {
			if (this.hasBasket) {
				System.out.println("You already have a basket on the " + this.year + " " + this.make + " " + this.model);
			} else {
				this.hasBasket = true;
				System.out.println("Successfully added a basket to your " + this.year + " " + this.make + " " + this.model);
			}
		} else {
			if (!this.hasBasket) {
				System.out.println("There is no basket on your " + this.year + " " + this.make + " " + this.model);
			} else {
				this.hasBasket = false;
				System.out.println("The basket was removed from your " + this.year + " " + this.make + " " + this.model);
			}
		}
	}
	
	
	@Override
	public void drive(double numOfMiles) {
		double gasNeeded = numOfMiles / this.mpg;
		double furthest = this.tankLevel * this.mpg;
		String side = this.kickstandLocation == 'l' ? "left" : this.kickstandLocation == 'L' ? "left" : "right";
		if (gasNeeded > this.tankLevel) {
			System.out.println("NOT ENOUGH GAS IN TANK TO COMPLETE TRIP!\nThe furthest you can travel is " + furthest + " miles");
		} else {
			if (this.hasBasket) {
				System.out.println("Put belongings in your basket");
			}
			this.miles += numOfMiles;
			this.tankLevel -= gasNeeded;
			System.out.println("Starting ride...");
			System.out.println("Ride ended. Your kickstand is on the " + side + " side");
			System.out.println("Distance traveled: " + numOfMiles + " miles\nGas used: " + gasNeeded + " gallons\nGas Left In Tank: " + this.tankLevel + " gallons\nOdometer: " + this.miles + " miles");
		}
		
	}

	@Override
	public void drive() {
		System.out.println("Please enter total amount of miles you wish to drive as type double");
		
	}


	@Override
	public void fillTank(double amountToFill) {
		if ((amountToFill + this.tankLevel) > this.tankCapacity) {
			System.out.println("NOT ENOUGH ROOM IN THE TANK FOR THAT MUCH GAS\nThe largest amount you can put in right now is " + (this.tankCapacity - this.tankLevel));
		} else {
			System.out.println("**curTank: " + this.tankLevel + "/" + this.tankCapacity);
			this.tankLevel += amountToFill;
			System.out.println("You put " + amountToFill + " gallons of gas in the tank.\nCurrent Fuel Level: " + this.tankLevel + "/" + this.tankCapacity + " gallons");
		}
		
	}


}
