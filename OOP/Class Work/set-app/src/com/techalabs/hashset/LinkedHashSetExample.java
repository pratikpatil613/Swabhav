package com.techalabs.hashset;

import java.util.*;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("pratik");
		set.add("Akash");
		set.add("Nilesh");
		set.add("Ketan");
		printInfo(set);
	}

	public static void printInfo(LinkedHashSet<String> set) {
		for (String names : set) {
			System.out.println(names);
		}
	}

}
