package com.cs1150.lab1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Point {

	private double x;
	private double y;

	public Point() {
		this(0.0, 0.0);
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double distanceTo(Point point) {
		double dx = this.x - point.x;
		double dy = this.y - point.y;

		return Math.sqrt(dx * dx + dy * dy);
	}

	@Override
	public String toString() {
		return "Point{x: " + x + ", y: " + y + "}";
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public static boolean check(int[] data) {
		if ((data.length % 2) != 0)
			return false;
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			data[i] *= 2;
			sum += data[i];
		}

		return (sum % 4) == 0;
	}

	public static int[] intersection(int[] a, int[] b) {
		List<Integer> intersections = new ArrayList<>();
		for(int i : a) {
			for(int j : b) {
				if(j == i) {
					intersections.add(i);
					break;
				}
			}
		}

		int[] ret = new int[intersections.size()];
		int index = 0;
		for(int i : intersections)
			ret[index++] = i;

		return ret;
	}

	public static void main(String[] args) {

		Point a = new Point(2, 3);
		Point b = new Point(3, 4);
		double d = a.distanceTo(b);
		System.out.println(d);
		System.out.println(a);
		a.setX(6.4);
		System.out.println(a);

		int[] arr1 = {1, 2, 3};
		int[] arr2 = {2, 3, 5};
		int[] arr3 = intersection(arr1, arr2);

		System.out.println(Arrays.toString(arr3));

	}


}
