package com.cs1150.util;

public class Stack<T> {

	private T[] data;
	private int size;

	public Stack() {
		this(0);
	}

	public Stack(int size) {
		data = (T[]) new Object[size + 1];
		this.size = size;
	}

	public boolean isEmpty() {
		return size == 0 || data.length == 0;
	}

	public void push(T obj) {

		if (size >= data.length) {
			// Expand Array
			T[] tmp = this.data;
			this.data = (T[]) new Object[tmp.length + 1];
			for (int i = 0; i < tmp.length; i++)
				this.data[i] = tmp[i];
		}

		data[size++] = obj;
	}

	public void clear() {
		size = 0;
	}

	public T pop() {
		return data[--size];
	}

	public int size() {
		return this.size;
	}

	public boolean isFull() {
		return this.size == this.data.length;
	}
}
