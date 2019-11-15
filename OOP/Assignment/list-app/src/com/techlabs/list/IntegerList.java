package com.techlabs.list;

import java.util.*;

public class IntegerList {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(100);
		numbers.add(200);
		numbers.add(300);
		numbers.add(400);
		numbers.add(500);

		System.out.println(numbers.get(0));
		System.out.println(numbers.get(1));
		System.out.println(numbers.get(2));
		System.out.println(numbers.get(3));
		System.out.println(numbers.get(4));

		System.out.println("Numbers:" + numbers);

		int index = numbers.indexOf(500);
		numbers.set(index, 1000);
		System.out.println("Numbers after updation:" + numbers);

		numbers.remove(4);
		System.out.println("Numbers after remove:" + numbers);

		Iterator iterate = numbers.iterator();
		while (iterate.hasNext()) {
			System.out.println(iterate.next());
		}

	}

}
