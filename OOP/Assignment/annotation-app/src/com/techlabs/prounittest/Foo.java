package com.techlabs.prounittest;

public class Foo {
	@ProunitTest
	public boolean method1() {
		return true;

	}

	public boolean method2() {
		return true;

	}

	@ProunitTest
	public boolean method3() {
		return true;

	}

	@ProunitTest
	public boolean method4() {
		return false;

	}

	@ProunitTest
	public boolean method5() {
		return true;
	}

}
