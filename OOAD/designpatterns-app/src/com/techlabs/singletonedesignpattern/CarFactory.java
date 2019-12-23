package com.techlabs.singletonedesignpattern;

public class CarFactory {
	
private static CarFactory carFactory=new CarFactory();
	
	private CarFactory() {
	}
	
	public static CarFactory getObject() {
		return carFactory;
	}

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
