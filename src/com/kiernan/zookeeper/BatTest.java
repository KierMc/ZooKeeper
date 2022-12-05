package com.kiernan.zookeeper;

import com.kiernan.zookeeper.models.Bat;

public class BatTest {

	public static void main(String[] args) {

		System.out.println("---------------Bat Test---------------");
		
		Bat newBat = new Bat();
		System.out.println(newBat.displayEnergy());
		
		newBat.attackTown();
		newBat.attackTown();
		newBat.attackTown();
		newBat.eatHumans();
		newBat.eatHumans();
		newBat.fly();
		newBat.fly();
		
		System.out.println(newBat.displayEnergy());
	}
}
