package com.kiernan.zookeeper.models;

public class Gorilla extends Mammal{

	public Gorilla() {
		// TODO Auto-generated constructor stub
	}
	
	//methods
	
	public String throwSomething() {
		String output = "The gorilla has thrown something.";
		energyLevel -= 5;
		System.out.println(output);
		return output;
	}
	
	public String eatBananas() {
		String output = "The gorilla is satisfied.";
		energyLevel += 10;
		System.out.println(output);
		return output;
	}
	
	public String climb() {
		String output = "The gorilla has climbed a tree.";
		energyLevel -= 10;
		System.out.println(output);
		return output;
	}
	

}
