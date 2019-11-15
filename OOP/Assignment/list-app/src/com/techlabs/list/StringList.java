package com.techlabs.list;

import java.util.*;

public class StringList {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("swabhav");
		names.add("pratik");
		names.add("sunny");
		System.out.println("List:" + names);

		int index = names.indexOf("sunny");
		names.set(index, "Ravi");
		System.out.println("Llist after updation:" + names);

		names.remove(1);
		System.out.println("List after remove method:" + names);

		System.out.println("using iterator");
		Iterator iterator = names.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
