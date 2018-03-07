package com.cs1150.test;

import com.cs1150.util.Point;

public class Ellipse extends Point {

	protected double rx;
	protected double ry;

	public Ellipse() {
		this(0, 0, 1, 1);
	}

	public Ellipse(double x, double y, double rx, double ry) {
		super(x, y);
		this.rx = rx;
		this.ry = ry;
	}


}
