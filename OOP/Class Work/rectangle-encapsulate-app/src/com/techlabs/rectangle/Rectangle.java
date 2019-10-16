package com.techlabs.rectangle;

public class Rectangle {
	private int width;
	private int height;

	public int calculateArea() {
		return width * height;

	}

	public void setWidth(int widthPassed) {
		width = widthPassed;
		if (width < 1) {
			width = 1;
		}
		else
		if (width > 100) {
			width = 100;
		}

	}

	public int getwidth() {
		return width;
	}

	public void setHeight(int heightPassed) {
		height = heightPassed;
		if (height < 1) {
			height = 1;
		}
		else
		if (height > 100) {
			height = 100;
		}

	}

	public int getHeight() {
		return height;
	}

}
