package com.cs1150.util;

public class LinkedStack<T> {

	private SNode head;
	private int maxSize;
	private int size;

	public LinkedStack() {
		this(10);
	}

	public LinkedStack(int maxSize) {
		this.head = null;
		this.maxSize = maxSize;
		this.size = 0;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public T pop() {
		if (head == null) throw new Error("Stack is empty");
		SNode p = head;
		head = p.next;
		size--;
		return p.data;
	}

	public void push(T data) {
		SNode p = new SNode(data);
		p.next = head;
		head = p;
		size++;
	}

	public boolean isFull() {
		return this.size >= maxSize;
	}

	private class SNode {
		private T data;
		private SNode next;

		private SNode(T data) {
			this.data = data;
			next = null;
		}
	}


}
