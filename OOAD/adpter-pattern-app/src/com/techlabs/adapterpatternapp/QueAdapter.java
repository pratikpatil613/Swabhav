package com.techlabs.adapterpatternapp;

import java.util.Iterator;
import java.util.LinkedList;

public class QueAdapter<T> implements IQueue<T> {
	private int position = -1;
	private LinkedList<T> queue = new LinkedList<T>();

	@Override
	public void enqueue(T item) {
		queue.addLast(item);
	}

	@Override
	public T dequeue() {
		return queue.removeFirst();
	}

	@Override
	public int count() {
		int count = 0;
		for (T c : queue) {
			count++;
		}
		return count;
	}

	
	 @Override 
	 public Iterator<T> iterator() { 
		 // public Iterator<QAdapter>  iterator() {
		 return this.queue.iterator();
				 //}
	 }
	 

}