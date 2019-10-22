package com.techlabs.circle;

public class Circle {
	private float radius;
	private String borderStyle;
	private final float PI=3.14f;

	public float calculateArea() {
		return PI * radius * radius;
	}

	public float calculatePerimeter() {
		return 2f * PI * radius;
	}

	public void setRadius(float radiusPassed) {
		if (radiusPassed < 1) {
			radius = 1;
		} else if (radiusPassed > 10) {
			radius = 10;
		} else {
			radius = radiusPassed;
		}
	}

	public float getRadius() {
		return radius;
	}

	public void setborderStyle(String borderPaased) {
		borderPaased = borderPaased.toLowerCase();
		if (!borderPaased.equals("single") && !borderPaased.equals("double")
				&& !borderPaased.equals("doted")) {
			borderStyle = "single";
		} else {
			borderStyle = borderPaased;
		}
	}

	public String getborderStyle() {
		return borderStyle;
	}

}
