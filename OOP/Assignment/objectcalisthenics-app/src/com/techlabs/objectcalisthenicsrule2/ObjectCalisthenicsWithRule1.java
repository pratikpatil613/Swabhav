package com.techlabs.objectcalisthenicsrule2;

public class ObjectCalisthenicsWithRule1 {
	public static void main(String[] args) {
		int greaterNumCase2 = case2(30, 20);
		System.out.println(greaterNumCase2);

	}

	public static int case2(int num1, int num2) {
		System.out.println("greater no is:");

		if (num1 > num2) {
			return num1;
		}
		return num2;
	}

}
