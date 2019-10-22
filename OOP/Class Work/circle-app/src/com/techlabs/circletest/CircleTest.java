package com.techlabs.circletest;

import com.techlabs.circle.Circle;

public class CircleTest {
	public static void main(String args[]) {
		Circle circ = new Circle();
		circ.setRadius(5.50f);
		circ.setborderStyle("DOUBLE");
		System.out.println("r -> " + circ.getRadius());
		System.out.println("b-> " + circ.getborderStyle());
		System.out.println("A-> " + circ.calculateArea());
		System.out.println("P-> " + circ.calculatePerimeter());

	}

}
