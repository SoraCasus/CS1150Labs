package com.cs1150.util;

public class Utils {

	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length - 1)
				System.out.print(", ");
		}
		System.out.print("]\n");
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

	public static int pow(int a, int b) {
		int tmp;
		int res;
		if (b == 0) res = 1;
		else {
			tmp = pow(a, b - 1);
			res = a * tmp;
		}
		return res;
	}

	public static long factorial(int n) {
		long res = 1;
		if (n == 0) return 1;
		else return n * factorial(n - 1);
	}

	public static long fibonacci(int n) {
		if (n == 0 || n == 1) return 1;
		else return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static String reverse(String s) {
		if (s.length() <= 1) return s;
		else {
			String t = s.substring(s.length() - 1);
			String r = s.substring(0, s.length() - 1);
			return t + reverse(r);
		}
	}

	public static int[] merge(int[] a, int[] b) {
		int length = a.length + b.length;
		int[] res = new int[length];
		int aIndex = 0;
		int bIndex = 0;
		for (int i = 0; i < length; i++) {
			if (aIndex >= a.length) {
				res[i] = b[bIndex++];
			} else if (bIndex >= b.length) {
				res[i] = a[aIndex++];
			} else if (a[aIndex] < b[bIndex]) {
				res[i] = a[aIndex++];
			} else {
				res[i] = b[bIndex++];
			}
		}
		return res;
	}

}
