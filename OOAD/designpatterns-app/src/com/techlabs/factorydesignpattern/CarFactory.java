package com.techlabs.factorydesignpattern;

public class CarFactory {

	public ICar getCar(String car) {
		if (car.equals(null)) {
			return null;
		}
		if (car.equalsIgnoreCase("BMW")) {
			return new BMW();

		} else if (car.equalsIgnoreCase("Mercedes")) {
			return new Mercedes();
		}
		return null;
	}

}
