package com.cs1150.lab5;

import com.cs1150.util.Utils;

public class Main {


	public static void main(String[] args) {

		int[] a = {1, 2, 3, 4, 5};
		int[] b = {3, 4, 5, 6, 7, 8};

		int[] c = Utils.difference(a, b);
		Utils.printArray(c);

		System.out.println();
		System.out.println();

		Statistics s = new Statistics();
		System.out.println(s.isEmpty());
		System.out.println(s.isFull());
		s.add(1.0);
		s.add(2.0);
		s.add(1.5);
		System.out.println(s.max());
		System.out.println(s.min());
		System.out.println(s.average());
		System.out.println(s.getSize());

	}


}
