package com.techlabs.withoutdecorator.test;

import com.techlabs.withoutdecorator.BufferedReader;
import com.techlabs.withoutdecorator.INameDisplay;
import com.techlabs.withoutdecorator.InputStreamReader;
import com.techlabs.withoutdecorator.InputText;

public class InputTextTest {
	public static void main(String[] args) {
		INameDisplay nameDisply = new BufferedReader(new InputStreamReader((new InputText("Pratik"))));
		nameDisply.displayName();
	}

}
