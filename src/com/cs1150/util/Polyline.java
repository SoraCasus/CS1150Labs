package com.cs1150.util;

public class Polyline {

	protected int size;
	protected Point[] points;

	public Polyline() {
		this(10);
	}

	public Polyline(int capacity) {
		size = 0;
		points = new Point[capacity];
	}

	public void add(Point p) {
		points[size++] = p;
	}

	public double getLength() {
		double sum = 0.0;
		for (int i = 0; i < size - 1; i++)
			sum += points[i].distanceTo(points[i + 1]);
		return sum;
	}


}
