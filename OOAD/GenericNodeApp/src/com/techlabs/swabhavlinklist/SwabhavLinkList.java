package com.techlabs.swabhavlinklist;

import com.sun.xml.internal.ws.api.pipe.NextAction;
import com.techlabs.genericnodeapp.Node;

import sun.text.normalizer.CharTrie.FriendAgent;

public class SwabhavLinkList<T> {
	Node firstNode;

	public void add(T item) {
		Node node = new Node<T>(item, null);
		if (firstNode == null) {
			firstNode = node;
		} else {
			Node newNode = firstNode;
			while (newNode.getNext() != null) {
				newNode = newNode.getNext();
			}
			newNode.setNext(node);
		}
	}

	public void remove(T item) {
		if (item == firstNode.getData()) {
			firstNode = firstNode.getNext();
		} else {
			Node newNode = firstNode;
			Node nextNode = null;
			// Node secondNode = null;

			while (newNode != null) {
				if (item == newNode.getNext().getData()) {
					nextNode = newNode.getNext();
					newNode.setNext(nextNode.getNext());

					break;
				}
				newNode = newNode.getNext();
			}
			// newNode=nextNode;
			// newNode.setNext(nextNode);

		}

	}

	public void display() {
		Node newNode = firstNode;
		while (newNode != null) {
			System.out.println(newNode.getData());
			newNode = newNode.getNext();
		}

	}

	public void count() {
		int count = 0;
		Node newNode = firstNode;
		while (newNode != null) {
			count++;
			newNode = newNode.getNext();
		}
		System.out.println("count:" + count);
	}

}
