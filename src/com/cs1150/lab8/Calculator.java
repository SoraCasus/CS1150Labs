package com.cs1150.lab8;

import com.cs1150.util.LinkedStack;

import java.util.Scanner;

public class Calculator {

	public void start() {
		LinkedStack<String> operators = new LinkedStack<>();

		Scanner scanner = new Scanner(System.in);
		System.out.print("> ");
		String in = scanner.nextLine().trim();
		StringBuilder postFix = new StringBuilder();
		char[] chars = in.toCharArray();
		for (char c : chars) {

			if (c == '+' || c == '-' || c == '*' || c == '/')
				operators.push("" + c);
			else if (c == '(') {
			} else if (c == ')')
				postFix.append(operators.pop());
			else
				postFix.append(c);
		}
		// @formatter:on

		while (!operators.isEmpty())
			postFix.append(operators.pop());

		evaluatePostFix(postFix.toString());
	}

	private void evaluatePostFix(String postFix) {
		LinkedStack<Double> stack = new LinkedStack<>();
		char[] chars = postFix.toCharArray();
		for (char c : chars) {
			// @formatter:off
			switch (c) {
				case '+': {
					double a = stack.pop();
					double b = stack.pop();
					double ans = a + b;
					stack.push(ans);
				} break;

				case '-': {
					double a = stack.pop();
					double b = stack.pop();
					double ans = b - a;
					stack.push(ans);
				} break;

				case '*': {
					double a = stack.pop();
					double b = stack.pop();
					double ans = a * b;
					stack.push(ans);
				} break;

				case '/': {
					double a = stack.pop();
					double b = stack.pop();
					double ans = b / a;
					stack.push(ans);
				} break;

				default: {
					try {
						double d = Double.parseDouble("" + c);
						stack.push(d);
					} catch (NumberFormatException e) {
						System.err.println("Unknown input: " + c);
					}

				} break;
			}
			// @formatter:on
		}

		System.out.println(stack.pop());
	}


}
