package com.techlabs.arraylist;

import java.io.*;
import java.util.*;

public class ArrayListSerialization {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		printArrayList(list);
		for (Integer a : list) {
			System.out.println(a);
		}

		try {

			File file = new File("Example.txt");

			FileOutputStream in = new FileOutputStream(file);
			ObjectOutputStream out = new ObjectOutputStream(in);
			out.writeObject(list);
			in.close();
			out.close();
			System.out.println("serialization done");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	private static void printArrayList(ArrayList<Integer> input) {
		input.add(10);
		input.add(20);
		input.add(30);
		input.add(40);
		input.add(50);
		input.add(60);

	}

}
