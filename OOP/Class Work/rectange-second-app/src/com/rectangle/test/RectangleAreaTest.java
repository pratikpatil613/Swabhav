package com.rectangle.test;

import com.rectanglle.Rectangle;

public class RectangleAreaTest {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(5, 10);
		Rectangle r2 = new Rectangle(10, 20);
		Rectangle r3 = new Rectangle(2, 10);
		Rectangle r4 = new Rectangle(12, 10);
		Rectangle r5=new Rectangle(5,5);
		
		Rectangle [] rectangles=new Rectangle[5];
		rectangles[0]=r1;
		rectangles[1]=r2;
		rectangles[2]=r3;
		rectangles[3]=r4;
		rectangles[4]=r5;
		
		Rectangle p=maxRectangle(rectangles);
		//System.out.println(p);
		System.out.println(p.getWidth());
		System.out.println(p.getHeight());


	}
	
	
	
	public static  Rectangle maxRectangle(Rectangle []rectangles) {
		Rectangle max=rectangles[0];
		
		 for(int i=0;i<rectangles.length;i++) {
	//		 rectangles[i].calculateArea();
			 if(max.calculateArea()<rectangles[i].calculateArea()) {
				 max=rectangles[i];
				 
			 }
			 
			 
		 }
		 return max;
		 
		
		
	
		
	}

}
