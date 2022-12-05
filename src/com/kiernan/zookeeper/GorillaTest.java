package com.kiernan.zookeeper;

import com.kiernan.zookeeper.models.Gorilla;

public class GorillaTest {

	public static void main(String[] args) {
		
		System.out.println("---------------Gorilla Test---------------");
		
		Gorilla newGor = new Gorilla();
		System.out.println(newGor.displayEnergy());
		
		newGor.throwSomething();
		newGor.throwSomething();
		newGor.throwSomething();
		newGor.eatBananas();
		newGor.eatBananas();
		newGor.climb();
		
		System.out.println(newGor.displayEnergy());
		
		
		
	}

}
