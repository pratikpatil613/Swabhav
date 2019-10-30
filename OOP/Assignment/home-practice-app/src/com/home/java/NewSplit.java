package com.home.java;

public class NewSplit {
	public static void main(String[] args) {
		String name = "Hello|word|mumbai";

		split(name, '|');

		/*
		 * String []words=split(name, '|'); for(String s:words) { System.out.println(s);
		 * }
		 */

	}

	public static void split(String wordInput, char charInput) {
		int i = 0;
		char []c=wordInput.toCharArray();
//		char s[]=new char[wordInput.length()];
		for (i = 0; i < wordInput.length(); i++) {
		char c1=wordInput.charAt(i);

			if (c[i]== charInput) {
			     break;

				


			}
		//	System.out.print(c);
		//	String []p=new String[c];
		//	for(String string:p)
		//	System.out.print(string);

			// String[] s=new String[c];
		//	System.out.print(c1);
			System.out.print(c1+" ");

		}


	}

}
