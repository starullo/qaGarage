package com.qagarage.vehicles;

public interface VehicleDriving {
	
	void drive();
	void drive(double numOfMiles);
	void fillTank(boolean fillTillFull);
	void fillTank(double amountToFill);
	
}
