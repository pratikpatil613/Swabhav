package com.techlabs.rectangle;

public class Rectangle {
	private int width;
	private int height;
	private String colour;

	public int calculateArea() {
		return width * height;

	}

	public void setWidth(int widthPassed) {

		if (widthPassed < 1) {
			width = 1;
		} else if (widthPassed > 100) {
			width = 100;
		} else {
			width = widthPassed;
		}

	}

	public int getwidth() {
		return width;
	}

	public void setHeight(int heightPassed) {
		if (heightPassed < 1) {
			height = 1;
		} else if (heightPassed > 100) {
			height = 100;
		} else {
			height = heightPassed;
		}

	}

	public int getHeight() {
		return height;
	}

	public void setColour(String colourPassed) {
		colourPassed = colourPassed.toLowerCase();
		if (!colourPassed.equals("red") && !colourPassed.equals("blue") && !colourPassed.equals("green")) {
			colour = "red";
		} else {
			colour = colourPassed;
		}
	}

	public String getColour() {
		return colour;
	}

}
