package com.techlabs.genericnodeapp;

public class Node<T> {
	private T data;
	private Node<T> next;

	public Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}

	public void setData(T data) {
		this.data = data;
	}

	public T getData() {
		// do {
		return data;
		// }while(this.next!=null);
	}

	public void setNext(Node<T> next) {
		this.next = next;

	}

	public Node<T> getNext() {
		return next;
	}

	/*
	 * public void print() { System.out.println(data); if (this.next != null) {
	 * this.next.print(); }
	 */

	/*
	 * public void display() { do { System.out.println(data+" " );
	 * 
	 * 
	 * }while(this.next!=null);
	 * 
	 * }
	 */

//	}

}
