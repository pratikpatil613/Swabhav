package com.home.java;

//import javafx.scene.shape.Cylinder;

public class StringOperations {
	public static void main(String args[]) {
		String name = "Swabhav Techlabs";
		int len = name.length();
		int count = 0, a = 0;
		char c;
// checking of vowel;

		for (int i = 0; i < len; i++) {
			c = name.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;

			}
//checking of repetition of a			
			if (c == 'a') {
				a++;
			}
		}

		System.out.println("numbers of vowel in String-> " + count);
		System.out.println("numbers of a= " + a);
//substring of string
		String sub = name.substring(0, 6);
		System.out.println("Substring of name-> " + sub);
		String sub2 = name.substring(8, 15);
		System.out.println("substring 2->" + sub2);

//index of a		
		int x = name.indexOf('a');
		System.out.println("Index of a-> " + x);
	}

}
