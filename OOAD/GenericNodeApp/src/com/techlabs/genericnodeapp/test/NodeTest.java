package com.techlabs.genericnodeapp.test;

import com.techlabs.genericnodeapp.Node;

public class NodeTest {
	public static void main(String[] args) {
		Node<Integer> node1 = new Node<Integer>(10, null);
		Node<Integer> node2 = new Node<Integer>(20, node1);
		Node<Integer> node3 = new Node<Integer>(30, node2);
		Node<Integer> node4 = new Node<Integer>(40, node3);

		Node<String> nodeC = new Node<String>("C", null);
		Node<String> nodeB = new Node<String>("B", nodeC);
		Node<String> nodeA = new Node<String>("A", nodeB);

		printInfo(node3);
		printInfo(node4);
		printInfo(nodeA);
	}

	private static void printInfo(Node node) {
		do {
			System.out.println(node.getData());
			node = node.getNext();
		} while (node != null);
		System.out.println("");
	}

}
