package com.techlabs.map;

import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Ravi");
		map.put(101, "Pratik");
		map.put(10, "Aniket");
		map.put(12, "Akash");
		map.put(10, "Sunny");
		map.put(106, "manoj");

		printInfo(map);

	}

	public static void printInfo(HashMap<Integer, String> map) {
		for (HashMap.Entry<Integer, String> KayValue : map.entrySet())
			System.out.println("Key = " + KayValue.getKey() + ", Value = " + KayValue.getValue());

	}

}
