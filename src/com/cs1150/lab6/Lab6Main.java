package com.cs1150.lab6;

import com.cs1150.util.Queue;

import java.util.Scanner;

public class Lab6Main {


	private static void generateBinary() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of binary numbers you want generated: ");
		int count = scanner.nextInt();
		Queue<String> queue = new Queue<>();
		queue.add("1");
		for (int i = 1; i <= count; i++) {
			String front = queue.remove();
			System.out.print(front + ", ");
			queue.add(front + "0");
			queue.add(front + "1");

		}
	}

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		// calc.rpnMain();
		calc.complexMain();

		// generateBinary();

	}

}
