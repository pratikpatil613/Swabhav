package com.rectanglle;

public class Rectangle {
	
	private int width;
	private  int height;
	
	public Rectangle(int widht,int height) {
		this.width=widht;
		this.height=height;
	}
	
	public int calculateArea() {
		return width*height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	


}
