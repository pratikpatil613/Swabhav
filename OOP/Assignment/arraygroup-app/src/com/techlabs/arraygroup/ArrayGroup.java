package com.techlabs.arraygroup;

public class ArrayGroup {
	public static void main(String[] args) {
		int[] numbers = { 10, 10, 10, 20, 20, 20,20, 30, 30, 40,50 };

		printEqualsCount(numbers);
	}

	public static void printEqualsCount(int[] numbers) {
		int count = 0, pointer = 0, temp = 0;
		temp = numbers[0];
		int len = numbers.length;

		for (pointer = 0; pointer < len; pointer++) {
			if (numbers[pointer] == temp) {
				count++;
			}

			if (pointer == len - 1 && numbers[pointer] == temp) {
				System.out.println(temp + "->" + count);
				break;
			}

			if (numbers[pointer] != temp) {

				System.out.println(temp + "->" + count);
				temp = numbers[pointer];
				pointer = pointer - 1;

				count = 0;

			}

		}

	}

}
