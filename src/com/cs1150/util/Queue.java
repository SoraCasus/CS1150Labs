package com.cs1150.util;

public class Queue<T> {

	private int size;
	private T[] data;

	public Queue() {
		this.size = 0;
		this.data = (T[]) new Object[16];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void add(T item) {
		if (this.isFull()) {
			T[] tmp = data;
			data = (T[]) new Object[size * 2];
			for (int i = 0; i < tmp.length; i++)
				data[i] = tmp[i];
		}

		data[size++] = item;
	}

	public boolean isFull() {
		return size == data.length;
	}

	public T remove() {
		T tmp = this.peek();
		for (int i = 0; i < size - 1; i++) {
			data[i] = data[i + 1];
		}
		data[--size] = null;

		return tmp;
	}

	public T peek() {
		return data[0];
	}
}
