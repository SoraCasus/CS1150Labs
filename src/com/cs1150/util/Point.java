package com.cs1150.util;

public class Point {

	private double x;
	private double y;

	public Point() {
		this(0, 0);
	}


	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double distanceTo(Point point) {
		double dx = point.x - this.x;
		double dy = point.y - this.y;

		return Math.sqrt(dx * dx + dy * dy);
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

	@Override
	public String toString() {
		return "Point{X: " + x + ", Y: " + y + "}";
	}


}
