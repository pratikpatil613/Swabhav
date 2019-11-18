package com.techalabs.hashset;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("pratik");
		set.add("Aakash");
		set.add("Nilesh");
		set.add("Ketan");
		set.add("Aniket");

		printInfo(set);

	}

	public static void printInfo(HashSet<String> set) {
		for (String names : set) {
			System.out.println(names);
		}
	}

}
