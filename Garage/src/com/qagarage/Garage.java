package com.qagarage;

import java.util.ArrayList;

import com.qagarage.vehicles.Vehicle;

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

}
