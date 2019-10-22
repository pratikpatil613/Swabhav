package com.techlabs.circletest;

import com.techlabs.circle.Circle;

public class AnonymouseObject {
	public static void main(String[] args) {
		// AnonymouseObject
		System.out.println(new Circle().calculateArea());
		CirclePrintTest.printInfo(new Circle());

	}

}
