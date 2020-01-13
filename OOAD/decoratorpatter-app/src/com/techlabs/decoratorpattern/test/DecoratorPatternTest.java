package com.techlabs.decoratorpattern.test;

import com.techlabs.decoratorpattern.BufferedReader;
import com.techlabs.decoratorpattern.Display;
import com.techlabs.decoratorpattern.InputStramReader;
import com.techlabs.decoratorpattern.InputTest;
import com.techlabs.decoratorpattern.SystemIn;

class DecoratorPatternTest {

	public static void main(String[] args) {
		Display name = new BufferedReader(new InputStramReader(new SystemIn(new InputTest("Pratik"))));
		name.displayName();

	}

}
