package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {
	public static void main(String args[]) {

		Rectangle small = new Rectangle();
		small.width = 20;
		small.height = 5;
		System.out.println("small rect width:" + small.width);
		System.out.println("small rect height" + small.height);
		System.out.println("small rect area:" + small.calculate());
		
		Rectangle big;
		big =new Rectangle();
		big.width=50;
		big.height=10;
		System.out.println("big rect width:" + big.width);
		System.out.println("small rect width:" + big.height);
		System.out.println("small rect width:" +big.calculate());



		
		

	}

}
