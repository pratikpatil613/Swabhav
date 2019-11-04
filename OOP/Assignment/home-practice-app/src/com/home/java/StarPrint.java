package com.home.java;

public class StarPrint {
	public static void main(String[] args) {
		pritnStar();

	}

	public static void pritnStar() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
