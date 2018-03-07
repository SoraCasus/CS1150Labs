package com.cs1150.util;

public class Utils {

	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length - 1)
				System.out.print(", ");
		}
		System.out.print("]");
	}

	public static <T> void printArray(T[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].toString());
			if (i != arr.length - 1)
				System.out.print(", ");
		}
		System.out.print("]\n");
	}

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
			if (array[m] > num)
				l = m;
		}
		return -1;
	}

	public static int binarySearch(char[] array, char num) {
		int l = 0;
		int r = array.length - 1;
		while (l <= r) {
			int m = (l + r) / 2;

			if (array[m] == num)
				return m;

			if (array[m] < num)
				l = m + 1;
			if (array[m] > num)
				r = m - 1;
		}
		return -1;
	}

	public static int[] difference(int[] a, int[] b) {
		int count = 0;
		int[] indices = new int[a.length];

		for (int i = 0; i < a.length; i++) {

			int test = a[i];
			boolean match = false;

			for (int j = 0; j < b.length; j++) {
				if (test == b[j])
					match = true;
			}

			if (!match) {
				indices[count++] = i;
			}

		}

		int[] res = new int[count];

		for (int i = 0; i < count; i++)
			res[i] = a[indices[i]];

		return res;
	}

}
