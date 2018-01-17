package com.cs1150.util;

public class Util {

	public static int[] increaseSize(int[] arr, int increaseSize) {
		int[] tmp = new int[arr.length + increaseSize];
		for (int i = 0; i < arr.length; i++)
			tmp[i] = arr[i];
		return tmp;
	}

	public static float[] increaseSize(float[] arr, int increaseSize) {
		float[] tmp = new float[arr.length + increaseSize];
		for (int i = 0; i < arr.length; i++)
			tmp[i] = arr[i];
		return tmp;
	}

	public static double[] increaseSize(double[] arr, int increaseSize) {
		double[] tmp = new double[arr.length + increaseSize];
		for (int i = 0; i < arr.length; i++)
			tmp[i] = arr[i];
		return tmp;
	}

	public static int[] bubbleSort(int[] arr) {
		boolean done = false;
		while (!done) {
			done = true;

			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					done = false;
					swap(arr, i, i + 1);
				}
			}
		}
		return arr;
	}

	public static int[] swap(int[] arr, int indexA, int indexB) {
		int tmp = arr[indexA];
		arr[indexA] = arr[indexB];
		arr[indexB] = tmp;
		return arr;
	}

	public static int binarySearch(int[] array, int num) {
		int l = 0;
		int r = array.length - 1;
		while (l <= r) {
			int m = (l + r) / 2;

			if (array[m] == num)
				return m;

			if (array[m] < num)
				r = m;
			else if (array[m] > num)
				l = m;
		}
		return -1;
	}

}
