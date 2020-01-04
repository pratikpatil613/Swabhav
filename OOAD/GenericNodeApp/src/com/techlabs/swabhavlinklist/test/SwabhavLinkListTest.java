package com.techlabs.swabhavlinklist.test;

import com.techlabs.swabhavlinklist.SwabhavLinkList;

public class SwabhavLinkListTest {
	public static void main(String[] args) {
		SwabhavLinkList<Integer> list = new SwabhavLinkList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		list.display();
		list.count();
		list.remove(40);
		list.display();
		list.count();

	}

}
