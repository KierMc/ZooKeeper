package com.kiernan.zookeeper.models;

public class Bat extends Mammal{

	public Bat() {
		super.energyLevel = 300;
	}
	
	//methods
	
	public String fly() {
		String output = "Whoosh!";
		energyLevel -= 50;
		System.out.println(output);
		return output;
	}
	
	public String eatHumans() {
		String output = "Nom Nom";
		energyLevel +=25;
		System.out.println(output);
		return output;
	}
	
	public String attackTown() {
		String output = "AHHHHHHH!!";
		energyLevel -=100;
		System.out.println(output);
		return output;
	}

}
