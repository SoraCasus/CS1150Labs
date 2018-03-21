package com.cs1150.lab7;

import com.cs1150.util.Set;

import java.util.Arrays;

public class Lab7Main {

	public static void main(String[] args) throws CloneNotSupportedException {


		MyThing o1 = new MyThing();
		o1.setValue(0);
		MyThing o2 = new MyThing();
		o2.setValue(8);
		MyThing o3 = new MyThing();
		o3.setValue(0);
		MyThing o4 = (MyThing) o1.clone();

		System.out.println(o1.equals(o3));
		System.out.println(o1.compareTo(o4) + " " + o3.compareTo(o4) + " " + o2.compareTo(o3));

		MyThing[] array = new MyThing[5];
		array[0] = new MyThing();
		array[0].setValue(2);
		array[1] = new MyThing();
		array[1].setValue(7);
		array[2] = new MyThing();
		array[2].setValue(3);
		array[3] = new MyThing();
		array[3].setValue(0);
		array[4] = new MyThing();
		array[4].setValue(11);
		Arrays.sort(array);

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		System.out.println("Sets");

		Set<Integer> intset1 = new Set<>();
		intset1.add(3);
		intset1.add(6);
		intset1.add(11);
		intset1.add(18);
		System.out.println("Set 1: " + intset1);

		Set<Integer> intset2 = new Set<>();
		intset2.add(5);
		intset2.add(2);
		intset2.add(11);
		System.out.println("Set 2: " + intset2);

		System.out.print("Union        ");
		Set<Integer> s = intset1.union(intset2);
		for (int i = 0; i < s.size(); i++) {
			System.out.print(s.get(i) + " ");
		}
		System.out.print("\nIntersection ");
		s = intset1.intersection(intset2);
		for (int i = 0; i < s.size(); i++) {
			System.out.print(s.get(i) + " ");
		}
		System.out.print("\nDifference   ");
		s = intset1.difference(intset2);
		for (int i = 0; i < s.size(); i++) {
			System.out.print(s.get(i) + " ");
		}
	}

}
