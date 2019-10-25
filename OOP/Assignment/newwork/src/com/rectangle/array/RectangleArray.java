package com.rectangle.array;

import java.awt.*;

//import java.awt.Rectangle;

public class RectangleArray {
	int width;
	int height;
	
	public RectangleArray(int width,int height) {
		// TODO Auto-generated constructor stub
		this.width=width;
		this.height=height;
	    
	
	}
	  
	public int getWidth() {
		return width;
	}
	Rectangle[] arr = new Rectangle[5];



/*	public static void main(String[] args) {

		Rectangle[] arr = new Rectangle[5];


	    arr[0] = new Rectangle(3, 2);

		arr[1] = new Rectangle(5, 25);

		arr[2] = new Rectangle(15, 10);

		arr[3] = new Rectangle(12, 12);
		
		arr[4] = new Rectangle(5, 10);
		
		
        for (int i = 0; i < arr.length; i++) 
            System.out.println("Element at " + i + " : " + 
                        arr[i].width +" "+ arr[i].height); 

	}*/
}
