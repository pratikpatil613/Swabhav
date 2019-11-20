package com.techlabs.customannotation;

public class Foo {
	@NeedRefactory
	public void m1() {
		if (true)
			System.out.println("Annoted methods");

	}

	public void m2() {

	}

	public void m3() {

	}

	@NeedRefactory
	public void m4() {

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
