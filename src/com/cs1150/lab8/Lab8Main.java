package com.cs1150.lab8;

import com.cs1150.util.LinkedQueue;

import java.util.Scanner;

public class Lab8Main {

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		calc.start();

		generateBinary();

	}

	private static void generateBinary() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of binary numbers you want to generate: ");
		int count = scanner.nextInt();
		LinkedQueue<String> queue = new LinkedQueue<>(count + 1);
		queue.push("1");
		for (int i = 1; i <= count; i++) {
			String front = queue.remove();
			System.out.print(front + ", ");
			queue.push(front + "0");
			queue.push(front + "1");
		}
	}

}
