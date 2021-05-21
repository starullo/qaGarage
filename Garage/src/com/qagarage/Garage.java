package com.qagarage;

import java.util.ArrayList;

import com.qagarage.vehicles.Vehicle;
import com.qagarage.vehicles.Car;
import com.qagarage.vehicles.Scooter;
import com.qagarage.vehicles.Motorcycle;

public class Garage {
	
	private String address;
	private ArrayList<Vehicle> vehicles;

	public Garage() {
		this.address = "???";
		this.vehicles = new ArrayList<Vehicle> ();
	}
	
	public Garage(String address) {
		this.address = address;
		this.vehicles = new ArrayList<Vehicle> ();
	}
	
	public String address() {
		return this.address;
	}
	
	public ArrayList<Vehicle> vehicles() {
		return this.vehicles;
	}
	
	public void setAddress(String newAddress) {
		this.address = newAddress;
	}
	
	public void addVehicle(Vehicle v) {
		this.vehicles.add(v);
	}
	
	@Override
	public String toString() {
		String output = "";
		for (Vehicle v : vehicles) {
			String type;
			if (v instanceof Scooter) {
				type = "Scooter";
			} else if (v instanceof Motorcycle) {
				type = "Motorcycle";
			} else if (v instanceof Car){
				type = "Car";
			} else {
				type = "???";
			}
			output += "\n************\n" + "Type of Vehicle: " + type + "\nMake: " + v.make() + "\nModel: " + v.model() + "\nYear: " + v.year() + "\nColor: " + v.color() + "\nMiles Per Gallon: " + v.mpg() + "\nOdometer: " + v.miles();
		}
		return output;
	}

}
