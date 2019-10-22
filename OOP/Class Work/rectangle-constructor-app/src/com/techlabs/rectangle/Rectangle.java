package com.techlabs.rectangle;

public class Rectangle {
	private int width;
	private int height;
	private String color;

	public Rectangle(int widthpassed, int heightpassed) {
		this(widthpassed, heightpassed,"");
	}
	
	public Rectangle(int widthpassed, int heightpassed,String colorpassed) {
		width=widthpassed;
		height=heightpassed;
		color=colorpassed;
		
	}

	public int getwidth() {
		return width;
	}

	public int getheight() {
		return height;
	}
	public String getcolor() {
		return color;
	}

	public int calculateArea() {
		return height * width;
	}

}
