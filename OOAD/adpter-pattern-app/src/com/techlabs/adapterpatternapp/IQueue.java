package com.techlabs.adapterpatternapp;

import java.util.Iterator;

public interface IQueue<T>extends Iterable<T>{
	public void enqueue(T item);

	public T dequeue();

	public int count();

}
