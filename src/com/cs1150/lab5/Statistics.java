package com.cs1150.lab5;

public class Statistics {

	protected double[] data;
	protected int size;

	public Statistics() {
		data = new double[10];
		size = 0;
	}

	public void add(double d) {
		if (size >= data.length)
			throw new StatisticsError();

		data[size++] = d;
	}

	public int getSize() {
		return size;
	}

	public boolean isFull() {
		return size == data.length;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public double min() {
		double min = data[0];
		for (int i = 0; i < size; i++)
			if (data[i] < min)
				min = data[i];
		return min;
	}

	public double max() {
		double max = data[0];
		for (int i = 0; i < size; i++)
			if (data[i] > max)
				max = data[i];
		return max;
	}

	public double average() {
		double sum = 0;
		for (double d : data)
			sum += d;
		return sum / size;
	}

	private static class StatisticsError extends Error {
		public StatisticsError() {
			super("Can not exceed 10 elements in Statistics");
		}
	}

}
