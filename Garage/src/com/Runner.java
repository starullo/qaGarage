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
		
		Vehicle fordFiesta = new Car("Ford", "Fiesta", "Blue", 2015, 58.43, 87.01, 22.0, 15.8, 4, true);
		Vehicle mCycle = new Motorcycle("Acme", "Wow-Bike", "Black", 2019, 51.3, 51.3, 0.0, 11.32, false, true);
		Vehicle scoot = new Scooter("Mega", "Great-Scooter", "Red", 2010, 522.2, 17.7, 13.4, 25.7);
		
		garage1.addVehicle(fordFocus);
		garage1.addVehicle(harley);
		garage1.addVehicle(vespa);
		garage1.addVehicle(fordFiesta);
		garage1.addVehicle(mCycle);
		garage1.addVehicle(scoot);
		
		harley.addIssue("Broken tailpipe", "3");
		fordFiesta.addIssue("Dead battery", "2");
		fordFiesta.addIssue("Cracked windshield", "2");
		scoot.addIssue("Broken Tire", "4");
		
		garage1.calculateBill(harley);
		garage1.calculateBill(fordFiesta);
		garage1.calculateBill(scoot);
				
	}

}
