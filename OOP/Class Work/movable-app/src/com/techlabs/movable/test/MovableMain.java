package com.techlabs.movable.test;

import com.techlabs.movable.Bike;
import com.techlabs.movable.Car;
import com.techlabs.movable.Imovable;
import com.techlabs.movable.Truck;

public class MovableMain {
	public static void main(String[] args) {
		Car c1 = new Car();
		Truck t1 = new Truck();
		Bike b1 = new Bike();

		// Car[] c = new Car[3];
		Imovable[] vechicles = new Imovable[3];
		vechicles[0] = c1;
		vechicles[1] = t1;
		vechicles[2] = b1;

		for (Imovable m : vechicles) {
			startRace(m);
		}

	}

	public static void startRace(Imovable movable) {
		movable.move();

	}

}
