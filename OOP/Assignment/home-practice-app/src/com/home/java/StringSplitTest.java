package com.home.java;

public class StringSplitTest {
	public static void main(String args[]) {

		String str = "Swabhav@Techlab";

		System.out.println("Split with @:");
		String[] strSplit = str.split("@");
		for (String s : strSplit) {
			System.out.println(s);
		}

		System.out.println("Split with limit 4:");
		String[] strSplit2 = str.split("a", 4);
		for (String s2 : strSplit2) {
			System.out.println(s2);

		}
		System.out.println("Split with limit 0:");
		String[] strSplit3 = str.split("@", 0);
		for (String s3 : strSplit3) {
			System.out.println(s3);

		}

		System.out.println("Split with - limit");
		String[] strSplit4 = str.split("a", -3);
		for (String s4 : strSplit4) {
			System.out.println(s4);
		}

	}
}
