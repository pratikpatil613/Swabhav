package com.techlabs.objectcalisthenicsrule2;

public class ObjectCalisthenicWithoutRule1 {
	public static void main(String[] args) {

		int greaterNumCase1 = case1(10, 20);
		System.out.println(greaterNumCase1);

	}

	public static int case1(int num1, int num2) {
		System.out.println("greater no is:");

		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}

	}

}
