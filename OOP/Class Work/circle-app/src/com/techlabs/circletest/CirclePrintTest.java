package com.techlabs.circletest;

import com.techlabs.circle.Circle;

public class CirclePrintTest {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		c1.setRadius(1.2f);
		c1.setborderStyle("single");
		c2.setRadius(5.5f);
		c2.setborderStyle("double");

		printInfo(c1);
		printInfo(c2);
	}

	static void printInfo(Circle c) {
		System.out.println("radius is: " + c.getRadius());
		System.out.println("border is: " + c.getborderStyle());
		System.out.println("Area is: " + c.calculateArea());
		System.out.println("Perimeter is: " + c.calculatePerimeter());
		System.out.println("");
	}

}
