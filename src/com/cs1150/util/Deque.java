package com.cs1150.util;

public class Deque<T> {

	private T[] data;
	private int size;

	public Deque() {
		this(16);
	}

	public Deque(int size) {
		this.data = (T[]) new Object[size];
		this.size = 0;
	}

	public void addFront(T item) {
		if (size >= data.length) {
			T[] tmp = (T[]) new Object[size * 2];
			tmp[0] = item;
			for (int i = 0; i < size; i++) {
				tmp[i + 1] = data[i];
			}
			data = tmp;
			size++;
		} else {
			for (int i = size; i > 0; i--) {
				data[i] = data[i - 1];
			}
			data[0] = item;
			size++;
		}
	}

	public void addEnd(T item) {
		if (size >= data.length) {
			T[] tmp = (T[]) new Object[size * 2];
			for (int i = 0; i < size; i++)
				tmp[i] = data[i];
			data = tmp;
		}

		data[size++] = item;
	}

	public T removeFront() {
		T res = data[0];
		for (int i = 0; i < size; i++)
			data[i] = data[i + 1];
		size--;

		return res;
	}

	public T removeEnd() {
		return data[--size];
	}

	public int getSize() {
		return size;
	}
}
