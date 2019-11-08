package com.techlabs.movable.test;

import com.techlabs.movable.Bike;
import com.techlabs.movable.Car;
import com.techlabs.movable.Imovable;
import com.techlabs.movable.Truck;

public class Main {
	public static void main(String[] args) {
		Car c1 = new Car();
		Truck t1 = new Truck();
		Bike b1 = new Bike();

		startRace(c1);
		startRace(t1);
		startRace(b1);

	}

	private static void startRace(Imovable move) {
		move.move();

	}

}
