package com.techalabs.hashset;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("Pratik");
		set.add("Aakash");
		set.add("Nilesh");
		set.add("Ketan");
		printInfo(set);
	}

	public static void printInfo(TreeSet<String> set) {
		for (String names : set) {
			System.out.println(names);
		}
	}

}
