package com.techlabs.factorydesignpattern.test;

import com.techlabs.factorydesignpattern.CarFactory;
import com.techlabs.factorydesignpattern.ICar;

public class CarPriceTest {
	public static void main(String[] args) {

		CarFactory carFactory = new CarFactory();

		ICar car = carFactory.getCar("BMW");

		ICar car1 = carFactory.getCar("Mercedes");

		print(car);
		print(car1);
	}

	private static void print(ICar car) {
		System.out.println("Price of " + car.getClass().getSimpleName()+" => " + car.getPrice());
	}

}
