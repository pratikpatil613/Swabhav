package com.techlabs.iterator;

import java.util.*;

public class ArrayIterator {
	public static void main(String[] args) {

		double[] numbers = { 10.0, 20.0, 30.0, 40.0, 50.0, 6.0, 70.0 };

		printArray(numbers);
	}

	public static void printArray(double[] ArrayInput) {
		Iterator array = Arrays.stream(ArrayInput).iterator();

		while (array.hasNext()) {
			System.out.println(array.next() + " ");
		}

	}

}
