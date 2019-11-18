package com.techlabs.objectcalisthenicsrule6;

import java.util.ArrayList;
import java.util.List;

public class ObjectCalisthenicsWithRule6 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);

		printNumber(numbers);

	}

	public static void printNumber(List<Integer> inputNumbers) {
		System.out.println("List OF Numbers");
		for (Integer n : inputNumbers) {
			System.out.println(n);
		}

	}

}
