package com.cs1150.util;

public class LinkedQueue<T> {

	private SNode head;
	private SNode tail;
	private int size;
	private int maxSize;

	public LinkedQueue() {
		this(10);
	}

	public LinkedQueue(int size) {
		this.maxSize = size;
		this.size = 0;
		this.head = null;
		this.tail = null;
	}

	public void push(T data) {
		if (isFull()) throw new Error("Queue is full!");
		SNode p = new SNode(data);
		p.next = null;
		if (head == null) {
			head = p;
			tail = p;
		} else {
			tail.next = p;
			tail = p;
		}
		size++;
	}

	public boolean isFull() {
		return size >= maxSize;
	}

	public T remove() {
		if (isEmpty()) throw new Error("Queue is Empty!");
		SNode p = head;
		head = head.next;
		size--;
		return p.data;
	}

	public boolean isEmpty() {
		return size == 0 || head == null;
	}

	private class SNode {
		private SNode next;
		private T data;

		private SNode(T data) {
			this.data = data;
		}
	}

}
