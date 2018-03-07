package com.cs1150.lab6;

import com.cs1150.util.Stack;

import java.util.Scanner;

public class Calculator {

	private Stack<Double> input;
	private boolean running = false;

	public Calculator() {
		this.input = new Stack<>();
		this.running = true;
	}

	public void complexMain() {

		Stack<String> operators = new Stack<>();

		Scanner scanner = new Scanner(System.in);
		System.out.print("> ");
		String in = scanner.nextLine().trim();
		StringBuilder postFix = new StringBuilder();
		char[] chars = in.toCharArray();
		for (char c : chars) {
			switch (c) {
				case '+': {
					operators.push("" + c);
				}
				break;

				case '-': {
					operators.push("" + c);
				}
				break;

				case '*': {
					operators.push("" + c);
				}
				break;

				case '/': {
					operators.push("" + c);
				}
				break;

				case '(': {
				}
				break;

				case ')': {
					postFix.append(operators.pop());
				}
				break;

				default: {
					postFix.append(c);
				}
				break;
			}
		}

		while (!operators.isEmpty()) {
			postFix.append(operators.pop());
		}

		evaluatePostFix(postFix.toString());

	}

	private void evaluatePostFix(String postFix) {
		Stack<Double> stack = new Stack<>();
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

	public void rpnMain() {

		while (running) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("> ");
			String in = scanner.nextLine().toLowerCase().trim();

			boolean isNumber = false;

			// @formatter:off
			switch (in) {
				case "+": {
					double a = input.pop();
					double b = input.pop();
					double c = a + b;
					System.out.println(c);
					input.push(c);
				} break;

				case "-": {
					double a = input.pop();
					double b = input.pop();
					double c = b - a;
					System.out.println(c);
					input.push(c);
				} break;

				case "*": {
					double a = input.pop();
					double b = input.pop();
					double c = a * b;
					System.out.println(c);
					input.push(c);
				} break;

				case "/": {
					double a = input.pop();
					double b = input.pop();
					double c = b / a;
					System.out.println(c);
					input.push(c);
				} break;

				case "sin": {
					double a = input.pop();
					double c = Math.sin(Math.toRadians(a));
					System.out.println(c);
					input.push(c);
				} break;

				case "cos": {
					double a = input.pop();
					double c = Math.cos(Math.toRadians(a));
					System.out.println(c);
					input.push(c);
				} break;

				case "tan": {
					double a = input.pop();
					double c = Math.tan(Math.toRadians(a));
					System.out.println(c);
					input.push(c);
				} break;

				case "pow": {
					double a = input.pop();
					double b = input.pop();
					double c = Math.pow(b, a);
					System.out.println(c);
					input.push(c);
				} break;

				case "exit": {
					running = false;
				} break;

				default: {
					isNumber = true;
				} break;

			}
			// @formatter:on

			if (isNumber) {
				try {
					input.push(Double.parseDouble(in));
				} catch (NumberFormatException e) {
					System.err.println("ERROR: Please enter a valid input");
				}
			}


		}

	}


}
