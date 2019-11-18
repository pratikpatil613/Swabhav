package com.techlabs.map;

import java.util.*;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(105, "Ravi");
		map.put(101, "Pratik");
		map.put(102, "Aniket");
		map.put(103, "Akash");
		map.put(104, "Sunny");
		map.put(106, "Manoj");

		printInfo(map);

	}

	public static void printInfo(TreeMap<Integer, String> map) {
		for (HashMap.Entry<Integer, String> KayValue : map.entrySet())
			System.out.println("Key = " + KayValue.getKey() + ", Value = " + KayValue.getValue());

	}

}
