package com.cs1150.lab9;

import com.cs1150.util.DoubleLinkedList;
import com.cs1150.util.Utils;

import java.io.PrintStream;

public class Lab9Main {


	private static void testDoubleLinkedList() {
		PrintStream o = System.out;
		DoubleLinkedList<String> list = new DoubleLinkedList<>();
		list.addEnd("D");
		list.addFront("B");
		list.addEnd("E");
		list.add(1, "C");
		list.addFront("A");
		for (int i = 0; i < 5; i++)
			o.print(" " + list.get(i));
		o.println();
		list.removeFront();
		list.removeEnd();
		list.remove(1);
		for (int i = 0; i < 2; i++)
			o.print(" " + list.get(i));
		o.println();
		list.remove(0);
		list.remove(0);
		o.println(list.isEmpty());
		list.add(0, "B");
		list.addFront("A");
		list.add(2, "C");
		for (int i = 0; i < 3; i++)
			o.print(" " + list.get(i));
		o.println();
		list.remove(3); //Note: the "3" is out of bounds
	}

	private static void testMerge() {
		int[] a = {1, 2, 3};
		int[] b = {3, 4, 5};

		int[] c = Utils.merge(a, b);
		Utils.printArray(a);
		Utils.printArray(b);
		Utils.printArray(c);
	}

	private static int sum(int m, int n) {
		// n is greater than m!
		int res = 0;
		res += m;
		if (m == n)
			return res;
		else
			res += sum(m + 1, n);

		return res;

	}

	public static void main(String[] args) {
		// testDoubleLinkedList();
		// testMerge();
		// System.out.println(sum(1, 3));

	}

}
