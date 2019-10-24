package com.techlabs.rectangle.test;

import com.techlabs.rectangle.BorderStyleType;
import com.techlabs.rectangle.Rectangle;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10, 20);
		Rectangle r2=new Rectangle(5, 10,BorderStyleType.Double);

		printInfo(r1);
		printInfo(r2);

	}

	public static void printInfo(Rectangle r) {
		System.out.println("width:" + r.getWidth());
		System.out.println("height:" + r.getHeight());
		System.out.println("border:" + r.getBorder());
		System.out.println("area:" + r.calculateArea());
		System.out.println();
	}

}
