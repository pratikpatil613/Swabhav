package com.techlabs.circletest;

import com.techlabs.circle.Circle;

public class CircleReferenceTest {
	public static void main(String[] args) {
		Circle c1=new Circle();
		c1.setRadius(5.5f);
		c1.setborderStyle("double");
		
		Circle temp=c1;
		System.out.println(temp.getRadius());
		System.out.println(c1.getRadius());
		temp.setRadius(6.5f);
		System.out.println(temp.getRadius());
		System.out.println(c1.getRadius());
		
		Circle temp1=c1;
		temp1.setRadius(6.6f);
		temp1=null;
		System.out.println(c1.getRadius());
		System.out.println(temp1.getRadius());
		
	}

}
