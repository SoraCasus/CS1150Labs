package com.cs1150.util;

public class Set<T> {

	private int size;
	private T[] data;

	public Set() {
		this(10);
	}

	public Set(int size) {
		this.data = (T[]) new Object[size];
		this.size = 0;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	public T get(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException();
		return data[index];
	}

	public Set<T> union(Set<T> other) {
		Set<T> set = new Set<>(this.data.length + other.data.length);
		for (int i = 0; i < this.size; i++)
			set.add(this.data[i]);
		for (int i = 0; i < other.size; i++)
			set.add(other.data[i]);
		return set;
	}

	public void add(T item) {
		if (this.size >= this.data.length) {
			T[] tmp = (T[]) new Object[this.size * 2];
			for (int i = 0; i < this.size; i++)
				tmp[i] = this.data[i];
			this.data = tmp;
		}

		for (int i = 0; i < this.size; i++)
			if (data[i].equals(item))
				return;
		data[size++] = item;
	}

	public Set<T> intersection(Set<T> other) {
		int size = this.size > other.size ? this.size : other.size;
		Set<T> set = new Set<>(size);
		for (int i = 0; i < size; i++)
			if (other.contains(data[i]))
				set.add(data[i]);
		return set;
	}

	public boolean contains(T item) {
		for (int i = 0; i < size; i++)
			if (item.equals(data[i]))
				return true;
		return false;
	}

	public Set<T> difference(Set<T> other) {
		Set<T> set = new Set<>(this.size);
		for (int i = 0; i < size; i++) {
			if (!other.contains(data[i]))
				set.add(data[i]);
		}

		return set;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Set{");
		for (int i = 0; i < size; i++) {
			sb.append(data[i].toString());
			if (i < size - 1)
				sb.append(", ");
		}
		sb.append("}");

		return sb.toString();
	}

}
