package com.cs1150.util;

public class DoubleLinkedList<T> {

	public int size;
	private DNode head;
	private DNode tail;

	public DoubleLinkedList() {
		size = 0;
		head = null;
		tail = null;
	}

	public void add(int index, T data) {
		if (index > size) throw new IndexOutOfBoundsException();
		if (index == size) {
			addEnd(data);
		} else if (index == 0) {
			addFront(data);
		} else {
			DNode p = head;
			for (int i = 0; i < index - 1; i++) {
				p = p.next;
			}
			DNode q = p.next;
			DNode r = new DNode(data);

			p.next = r;
			r.prev = p;

			r.next = q;
			q.prev = r;

			size++;
		}
	}

	public void addEnd(T data) {
		DNode p = new DNode(data);
		if (size == 0 || head == null || tail == null) {
			addFront(data);
		} else {
			tail.next = p;
			p.prev = tail;
			tail = p;
			size++;
		}
	}

	public void addFront(T data) {
		DNode p = new DNode(data);
		if (head == null) {
			head = p;
			tail = p;
		} else {
			p.next = head;
			head.prev = p;
			head = p;
		}

		size++;
	}

	public T remove(int index) {
		if (index >= size) throw new IndexOutOfBoundsException();
		if (index == size - 1)
			return removeEnd();
		else if (index == 0)
			return removeFront();
		else {
			DNode p = head;
			for (int i = 0; i < index; i++) {
				p = p.next;
			}
			DNode q = p.prev;
			DNode r = p.next;

			q.next = r;
			r.prev = q;

			size--;

			return p.data;
		}
	}

	public T removeEnd() {
		if (size == 0 || tail == null || head == null) throw new ArrayIndexOutOfBoundsException("The list is empty!");
		DNode p = tail;
		if (p.prev != null) {
			tail = p.prev;
			tail.next = null;
		} else {
			tail = null;
			head = null;
		}
		size--;

		return p.data;
	}

	public T removeFront() {
		if (size == 0 || head == null || tail == null) throw new ArrayIndexOutOfBoundsException("The list is empty!");
		DNode p = head;
		if (head.next == null) {
			head = null;
			tail = null;
		} else {
			head = head.next;
			head.prev = null;
		}
		size--;
		return p.data;
	}

	public T get(int index) {
		if (index >= size) throw new IndexOutOfBoundsException();
		DNode p = head;
		for (int i = 0; i < index; i++)
			p = p.next;
		return p.data;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int getSize() {
		return size;
	}

	private class DNode {
		private T data;
		private DNode next;
		private DNode prev;

		public DNode(T data) {
			this.data = data;
		}
	}

}
