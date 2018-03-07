package com.cs1150.lab7;

public class MyThing implements Comparable<MyThing>, Cloneable {

	private int value;

	public MyThing() {
		this(0);
	}

	public MyThing(int value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;

		if (o instanceof MyThing) {
			MyThing m = (MyThing) o;
			if (m.value == this.value)
				return true;
		}
		return false;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		MyThing thing = (MyThing) super.clone();
		thing.setValue(this.value);
		return thing;
	}

	@Override
	public String toString() {
		return "MyThing{value: " + value + "}";
	}

	@Override
	public int compareTo(MyThing o) {
		return this.value - o.value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
