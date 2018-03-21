package com.cs1150.util;

import java.util.Iterator;

public class LinkedList<T> implements List<T> {

	private SNode head;
	private SNode tail;
	private SNode pointer;
	private SNode qPointer;
	private int length;

	@Override
	public int size() {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public boolean contains(T o) {
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		return null;
	}

	@Override
	public void add(T o) {
		pointer = new SNode(o);
		if (length == 0) {
			head = pointer;
			tail = pointer;
			pointer = null;
		} else {
			tail.next = pointer;
			tail = pointer;
			pointer = null;
		}
		length++;
	}

	@Override
	public void add(int index, T o) {

	}

	@Override
	public boolean remove(T o) {
		return false;
	}

	@Override
	public void clear() {

	}

	@Override
	public T get(int index) {
		return null;
	}

	@Override
	public void set(int index, T o) {

	}

	@Override
	public void remove(int index) {

	}

	@Override
	public int indexOf(T o) {
		return 0;
	}

	public void addFront(T o) {
		pointer = new SNode(o);
		if (length == 0) {
			head = pointer;
			tail = pointer;
			pointer = null;
		} else {
			pointer.setNext(head);
			head = pointer;
			pointer = null;
		}
		length++;
	}

	@Override
	public String toString() {
		pointer = head;
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		while (pointer != null) {
			sb.append(pointer.data.toString());
			if (pointer.next != null)
				sb.append(", ");
			pointer = pointer.next;
		}
		sb.append("]");
		return sb.toString();
	}

	private class SNode {
		public T data;
		public SNode next;

		public SNode(T data) {
			this.data = data;
			this.next = null;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public SNode getNext() {
			return next;
		}

		public void setNext(SNode next) {
			this.next = next;
		}
	}
}
