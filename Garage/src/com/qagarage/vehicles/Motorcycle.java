package com.qagarage.vehicles;

public class Motorcycle extends Vehicle {
	
	private boolean hasRadio;
	private boolean hasSideCar;

	public Motorcycle() {
		super();
		this.hasRadio = false;
		this.hasSideCar = false;
	}
	
	public Motorcycle(String make, String model, String color, int year, double tankLevel, double tankCapacity, double miles, double mpg, boolean hasRadio, boolean hasSideCar) {
		super(make, model, color, year, tankLevel, tankCapacity, miles, mpg);
		this.hasRadio = hasRadio;
		this.hasSideCar = hasSideCar;
	}

	@Override
	public void drive(double numOfMiles) {
		double gasNeeded = numOfMiles / this.mpg;
		double longestDistance = this.tankLevel * this.mpg;
		if (gasNeeded > this.tankLevel) {
			System.out.println("You don't have enough gas in the tank to make that trip. The longest distance you can ride is " + longestDistance);
		} else {
			this.tankLevel -= gasNeeded;
			this.miles += numOfMiles;
			System.out.println("Starting trip");
			if (this.hasRadio) {
				System.out.print("Feel free to turn on the radio");
			}
			if (this.hasSideCar) {
				System.out.println(" or make use of the side car");
			}
			System.out.println(" ");
			System.out.println("You just rode " + numOfMiles + " miles\n gas used: " + gasNeeded + " gallons\n gas left: " + this.tankLevel + " gallons\nodometer: " + this.miles + " miles");
		}
		
	}


	@Override
	public void fillTank(double amountToFill) {
		if ((amountToFill + this.tankLevel) > this.tankCapacity) {
			System.out.println("Too much gas for this motorcycle, the most you can put in is " + (this.tankCapacity - this.tankLevel));
		} else {
			this.tankLevel += amountToFill;
			System.out.println(amountToFill + " gallons added to tank\nfuel tank status: " + this.tankLevel + "/" + this.tankCapacity + " gallons");
		}
	}


}
