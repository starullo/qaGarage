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
	
	public void calculateBill(Vehicle vs) {
		double total = 0.0;
		String output = "FIXED:\n";
		if (vs.issuesLength() == 0) {
			System.out.println("No problems with the car!");
			return;
		}
			for (int j = 0; j < vs.issues().size(); j++) {
				double amtToAdd = 0.0;
				String problem = vs.issue(j);
				char level = problem.charAt(problem.length() - 1);
				char toBeReplaced = problem.charAt(problem.length() - 1);
				String newP = problem.replace(toBeReplaced, ' ');
				output += newP + ": ";

				switch(level) {
				case '1':
					amtToAdd += 100;
					break;
				case '2':
					amtToAdd += 200;
					break;
				case '3':
					amtToAdd += 300;
					break;
				case '4':
					amtToAdd += 400;
						break;
				default:
					amtToAdd += 500;
				}
				
				if (vs instanceof Scooter) {
					amtToAdd += (amtToAdd * .05);
				} else if (vs instanceof Motorcycle) {
					amtToAdd += (amtToAdd * .1);
				} else {
					amtToAdd += (amtToAdd * .2);
				}
				

				output += "$" + amtToAdd + "\n";
				total += amtToAdd;
			}
		vs.removeIssues();
		output += "TOTAL: $" + total;
		System.out.println(output);
	}
	
	public void removeVehicle(double id) {
		for (int i = 0; i < this.vehicles.size(); i++) {
			Vehicle v = this.vehicles.get(i);
			if (v.id() == id) {
				this.vehicles.remove(i);
			}
		}
	}
	
	public void removeVehicle(String make, String model) {
		for (int i = 0; i < this.vehicles.size(); i++) {
			Vehicle v = this.vehicles.get(i);
			String ma = v.make();
			String mo = v.model();
			if (ma.toLowerCase() == make.toLowerCase() && mo.toLowerCase() == model.toLowerCase()) {
				this.vehicles.remove(i);
			}
		}
	}
	
	public void removeVehicle(String type) {
		for (int i = 0; i < this.vehicles.size(); i++) {
			Vehicle v = this.vehicles.get(i);
			if (v instanceof Motorcycle) {
				if (type.toLowerCase() == "motorcycle") {
					this.vehicles.remove(i);
				}
			} else if (v instanceof Scooter) {
				if (type.toLowerCase() == "scooter") {
					this.vehicles.remove(i);
				}
			} else if (v instanceof Car) {
				if (type.toLowerCase() == "car") {
					this.vehicles.remove(i);
				}
			}
		}
	}
	
	public void emptyGarage() {
		this.vehicles.clear();
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
