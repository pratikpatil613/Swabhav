package com.techlabs.rectangle;

public class Rectangle {
	private int width;
	private int height;
	private BorderStyleType border;

	public Rectangle(int width, int height) {
		this(width, height, BorderStyleType.Single);
	}

	public Rectangle(int width, int height, BorderStyleType border) {
		this.width = width;
		this.height = height;
		this.border = border;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public BorderStyleType getBorder() {
		return border;
	}

	public int calculateArea() {
		return width * height;
	}

}
