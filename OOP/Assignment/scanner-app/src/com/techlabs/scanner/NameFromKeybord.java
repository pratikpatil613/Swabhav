package com.techlabs.scanner;

import java.util.Scanner;

public class NameFromKeybord {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("name:");
		String name = in.next();
		System.out.println("!Hello!" + name);
	}

}
