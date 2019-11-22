package com.techlabs.stringinput;

import java.util.Stack;

public class ParanthesesUsingStack {
	public static void main(String[] args) {
		String symbol = "((}}";

		printTrueFalse(symbol);
	}

	public static void printTrueFalse(String symbolInput) {

		Stack<Character> stack = new Stack<Character>();

		for (int pointerAt = 0; pointerAt < symbolInput.length(); pointerAt++) {
			char character = symbolInput.charAt(pointerAt);
			if ((character == '{') || (character == '[') || (character == '(')) {
				stack.push(character);
			} else if ((character == '}' && '{' == stack.peek()) || (character == ']' && '[' == stack.peek())
					|| (character == ')' && '(' == stack.peek())) {
				stack.pop();

			} else {
				stack.push(character);
			}

		}
		if (stack.empty())

		{
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}
}

//}
