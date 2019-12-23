package com.techlabs.singletonedesignpattern.test;

import com.techlabs.singletonedesignpattern.CarFactory;
import com.techlabs.singletonedesignpattern.ICar;

public class CarPriceTest {
	public static void main(String[] args) {

	//	CarFactory carFactory = new CarFactory();
		
		CarFactory carFactory =CarFactory.getObject();


		ICar car = carFactory.getCar("BMW");
		ICar car1 = carFactory.getCar("Mercedes");

		print(car);
		print(car1);
	}

	private static void print(ICar car) {
		System.out.println("Price of " + car.getClass().getSimpleName()+" => " + car.getPrice());
	}

}
