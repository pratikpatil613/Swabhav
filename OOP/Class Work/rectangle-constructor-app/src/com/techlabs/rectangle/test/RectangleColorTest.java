package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleColorTest {
	public static void main(String[] args) {
		Rectangle r1=new Rectangle(5,20,"red");
		printInfo(r1);
		printInfo(new Rectangle(3,10,"blue"));
	}
	
	public static void printInfo(Rectangle r) {
		System.out.println("rect width is:"+r.getwidth());
		System.out.println("rect height is:"+r.getheight());
		System.out.println("rect color is :"+r.getcolor());
		System.out.println("rect area is:"+r.calculateArea());
		
	}

}
