package com.cs1150.util;

public class Polygon extends Polyline {

	public Polygon(int capacity) {
		super(capacity);
	}

	public Polygon() {
		super();
	}

	@Override
	public double getLength() {
		return getPerimeter();
	}

	public double getPerimeter() {
		double sum = super.getLength();
		sum += points[0].distanceTo(points[super.size - 1]);

		return sum;
	}


}
