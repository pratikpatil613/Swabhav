package com.techlabs.man.test;

import com.techlabs.man.Boy;
import com.techlabs.man.Man;

public class ManTest {
	public static void main(String[] args) {
	//	caseStudy1();
		caseStudy2();
	}

	public static void caseStudy1() {
		Man x = new Man();
		x.read();
		x.walk();
		x.play();

	}

	public static void caseStudy2() {
		Boy y = new Boy();

		y.eat();
		y.dance();
		y.read();
		y.walk();
		y.play();

	}

}
