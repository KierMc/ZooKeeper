package com.kiernan.zookeeper.models;

public class Mammal {

	//attribute
	public int energyLevel;
	
	public Mammal() {
		this.energyLevel = 100;
	}

	//method
	public String displayEnergy() {
		String output = "Energy Level: " + energyLevel;
		return output;
	}
}
