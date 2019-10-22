package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle r1=new Rectangle(5,3);
		
		printInfo(r1);
		printInfo(new Rectangle(0, 2));
	}
	public static void printInfo(Rectangle r) {
		System.out.println("rec width is:"+r.getwidth());
		System.out.println("rec height is:"+r.getheight());
		System.out.println("Area is:"+r.calculateArea());
		System.out.println("");
		
	}

}
