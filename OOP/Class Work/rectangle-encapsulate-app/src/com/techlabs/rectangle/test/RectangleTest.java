package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {
	public static void main(String args[]) {

		Rectangle small = new Rectangle();
		small.setWidth(2);
		small.setHeight(20);
		small.setColour("BLUE");
		System.out.println("small rect width:" + small.getwidth());
		System.out.println("small rect height:" + small.getHeight());
		System.out.println("small rect arrea:" + small.calculateArea());
		System.out.println("small rect color is:"+small.getColour());
	}
}
