package com.techlabs.decoratorpattern.test;

import com.techlabs.decoratorpattern.Display;
import com.techlabs.decoratorpattern.InputStreamReader;
import com.techlabs.decoratorpattern.InputTest;
import com.techlabs.decoratorpattern.Systemin;

public class Main {
	public static void main(String[] args) {
		Display name = new InputStreamReader((new InputTest()));
		name.display();
	}
}
