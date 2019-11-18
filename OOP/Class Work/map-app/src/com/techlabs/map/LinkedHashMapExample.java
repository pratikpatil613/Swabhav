package com.techlabs.map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(105, "Ravi");
		map.put(101, "Pratik");
		map.put(102, "Aniket");
		map.put(103, "Akash");
		map.put(104, "Sunny");
		map.put(106, "manoj");
		printInfo(map);

	}

	public static void printInfo(LinkedHashMap<Integer, String> map) {
		for (HashMap.Entry<Integer, String> KayValue : map.entrySet())
			System.out.println("Key = " + KayValue.getKey() + ", Value = " + KayValue.getValue());

	}

}
