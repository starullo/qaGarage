package com;

import com.qagarage.Garage;
import com.qagarage.vehicles.Vehicle;
import com.qagarage.vehicles.Car;
import com.qagarage.vehicles.Motorcycle;

public class Runner {

	public static void main(String[] args) {
		Garage garage1 = new Garage("222 N. Main St");
		Vehicle fordFocus = new Car("Ford", "Focus", "Gray", 2005, 8.43, 77.43, 0.0, 5.8, 4, true);
		garage1.addVehicle(fordFocus);
		Vehicle harley = new Motorcycle("Harley-Davidson", "AwesomeBike2", "Black", 1999, 50.0, 50.0, 0, 3.0, true, false);
		harley.drive(22);
	}

}
