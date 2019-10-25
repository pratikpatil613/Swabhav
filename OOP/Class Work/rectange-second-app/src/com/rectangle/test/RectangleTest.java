package com.rectangle.test;

import com.rectanglle.Rectangle;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10, 20);
		Rectangle r2 = new Rectangle(5, 10);

		Rectangle[] rectangles = new Rectangle[2];
		rectangles[0] = r1;
		rectangles[1] = r2;

		
		for(Rectangle r:rectangles) {
			pritInfo(r);
		}
		
	}

	public static void pritInfo(Rectangle r) {
		System.out.println("widht" + r.getWidth());
		System.out.println("height" + r.getHeight());
	}

}
