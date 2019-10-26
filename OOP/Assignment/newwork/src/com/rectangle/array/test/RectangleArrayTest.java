package com.rectangle.array.test;

import com.rectangle.array.RectangleArray;

public class RectangleArrayTest {
	public static void main(String[] args) {
		RectangleArray r1 = new RectangleArray(5, 5);
		RectangleArray r2 = new RectangleArray(50, 10);
		RectangleArray r3 = new RectangleArray(10, 5);
		RectangleArray r4 = new RectangleArray(12, 5);
		RectangleArray r5 = new RectangleArray(10, 10);

		RectangleArray[] rectangles = new RectangleArray[5];
		rectangles[0] = r1;
		rectangles[1] = r2;
		rectangles[2] = r3;
		rectangles[3] = r4;
		rectangles[4] = r5;

		RectangleArray max = maxRect(rectangles);
		System.out.println(max.getWidth());
		System.out.println(max.getHeight());

		sumOfAreafRectangle(rectangles);
		avgOfAreaOfRectangle(rectangles);

	}

	public static RectangleArray maxRect(RectangleArray[] rectangle) {
		RectangleArray max = rectangle[0];
		System.out.println("Max rectangle in an array:");
		for (int i = 0; i < rectangle.length; i++) {
			if (max.calculatArea() < rectangle[i].calculatArea()) {
				max = rectangle[i];
			}
		}
		return max;

	}

	public static void sumOfAreafRectangle(RectangleArray[] rectangle) {
		int sum = 0;
		System.out.println("Sum of Area Of Rectangle:");
		for (int i = 0; i < rectangle.length; i++) {
			sum = sum + rectangle[i].calculatArea();
		}
		System.out.println(sum);
	}

	public static void avgOfAreaOfRectangle(RectangleArray[] rectangle) {
		int avg = 0, sum = 0;
		System.out.println("Avg Of Area Of Rectangle:");
		for (int i = 0; i < rectangle.length; i++) {
			sum = sum + rectangle[i].calculatArea();
			avg = sum / rectangle.length;
		}
		System.out.println(avg);
	}

}
