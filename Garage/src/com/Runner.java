package com;

import com.qagarage.Garage;
import com.qagarage.vehicles.Vehicle;
import com.qagarage.vehicles.Car;
import com.qagarage.vehicles.Motorcycle;
import com.qagarage.vehicles.Scooter;

public class Runner {

	public static void main(String[] args) {
		Garage garage1 = new Garage("222 N. Main St");
		Vehicle fordFocus = new Car("Ford", "Focus", "Gray", 2005, 8.43, 77.43, 0.0, 5.8, 4, true);
		Vehicle harley = new Motorcycle("Harley-Davidson", "AwesomeBike2", "Black", 1999, 50.0, 50.0, 0.0, 3.0, true, false);
		Vehicle vespa = new Scooter("Vespa", "Cool-Scooter", "Blue", 2020, 0.0, 22.4, 0.0, 25.0);
		
		garage1.addVehicle(fordFocus);
		garage1.addVehicle(harley);
		garage1.addVehicle(vespa);
		System.out.println(garage1.toString());
	}

}
