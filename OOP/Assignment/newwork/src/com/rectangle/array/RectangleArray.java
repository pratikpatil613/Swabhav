package com.rectangle.array;

public class RectangleArray {
	int width;
	int height;

	public RectangleArray(int width, int height) {
		// TODO Auto-generated constructor stub
		this.width = width;
		this.height = height;
	}

	public int calculatArea() {

		return width * height;
	}

	public int getWidth() {
		return width;

	}

	public int getHeight() {
		return height;
	}
}
