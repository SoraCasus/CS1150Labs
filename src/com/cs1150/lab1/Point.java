package com.cs1150.lab1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Point {

	private double x;
	private double y;

	/**
	 * Default constructor, initializes x & y to 0.0
	 */
	public Point() {
		this(0.0, 0.0);
	}

	/**
	 * Constructor for the Point Class,
	 * Holds two values representing the X and Y coordinates
	 * @param x - The x coordinate
	 * @param y - The y coordinate
	 */
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) {

		int[] arr0 = {};
		boolean flag = check(arr0);
		System.out.println(flag);

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

	/**
	 * Performs a variety of checks on the array
	 * @param data - The array to perform the checks on
	 * @return - If the given array passes the checks
	 */
	public static boolean check(int[] data) {
		// Test if the given array has an even number of values
		if ((data.length % 2) == 0) {
			int sum = 0;
			// Double each value of the array and calculate the sum of all the values
			for (int i = 0; i < data.length; i++) {
				data[i] *= 2;
				sum += data[i];
			}
			// Check if the value of the sum is divisible by 4, true if yes, false otherwise
			return (sum % 4) == 0;
		}
		return false;
	}

	/**
	 * Calculates the distance between this {@code Point}
	 * and the {@code Point} given
	 *
	 * @param point - The point to calculate the distance to
	 * @return - The distance in which the given point is
	 * from this point. Note: This is the absolute value of the distance
	 */
	public double distanceTo(Point point) {
		double dx = this.x - point.x; // Calculate the x - distance
		double dy = this.y - point.y; // Calculate the y - distance

		// Calculate and return the distance by pythagorean's theorem
		return Math.sqrt(dx * dx + dy * dy);
	}

	/**
	 * Compares two arrays and returns an array containing the intersection
	 * between both.
	 * @param a - The first array to be compared
	 * @param b - The second array to be compared
	 * @return - The array containing the intersection values between the two
	 */
	public static int[] intersection(int[] a, int[] b) {
		// Create a list for unknown amount of integers
		List<Integer> intersections = new ArrayList<>();
		// iterate through each of the integers in the first array
		for (int i : a) {
			// For each value of first array, check second array for a match
			for (int j : b) {
				if (j == i) {
					// If there is a match, add the integer to the list
					intersections.add(i);
					break;
				}
			}
		}

		// Convert the list to an array.
		// Create an array the same size as the list
		int[] ret = new int[intersections.size()];
		int index = 0;
		// Add each integer from the list to the array
		for(int i : intersections)
			ret[index++] = i;

		// Return the created array
		return ret;
	}

	/**
	 * Converts the Point Class and data into a {@code String}
	 * <br> Ex: "Point{x: 1.0, y: 2.0}"
	 *
	 * @return - The String form of the Class
	 */
	@Override
	public String toString() {
		return "Point{x: " + x + ", y: " + y + "}";
	}

	/**
	 * @return - The x coordinate of the point
	 */
	public double getX() {
		return x;
	}

	/**
	 * @param x - The value to change the x coordinate to
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * @return - The y coordinate of the point
	 */
	public double getY() {
		return y;
	}

	/**
	 * @param y - The value to change the y coordinate to
	 */
	public void setY(double y) {
		this.y = y;
	}


}
