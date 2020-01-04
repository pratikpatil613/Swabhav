package com.techlabs.adapterpatternapp.test;

import java.util.Iterator;

import com.techlabs.adapterpatternapp.IQueue;
import com.techlabs.adapterpatternapp.QueAdapter;

public class LinkListTest {
	public static void main(String[] args) {
		IQueue<Integer> list = new QueAdapter<Integer>();
		list.enqueue(10);
		list.enqueue(20);
		list.enqueue(30);
		list.enqueue(40);
		System.out.println("Count:" + list.count());
		System.out.println("dequeue:"+list.dequeue());
		System.out.println("Count after dequeue:" + list.count());

		for (Integer item : list) {
			System.out.println(item);
		}

	}

}
