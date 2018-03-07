package com.cs1150.util;

import java.util.Iterator;

public interface List<T> {

	/**
	 * @return The number of elements within the list
	 */
	int size();

	/**
	 * @return If the list contains no elements
	 */
	boolean isEmpty();

	/**
	 * @param o - The object to search for
	 * @return If the list contains the specified object
	 */
	boolean contains(T o);

	/**
	 * @return The Iterator to iterate through the list
	 */
	Iterator<T> iterator();

	/**
	 * @param o - The object to add to the list
	 */
	void add(T o);

	/**
	 * @param index - The index to insert the object into,
	 *              other elements get shuffled
	 * @param o     - The object to be inserted into the list
	 */
	void add(int index, T o);

	/**
	 * @param o - The object to be removed from the list
	 * @return Not too sure yet >.<
	 */
	boolean remove(T o);

	/**
	 * Removes all elements from the list
	 */
	void clear();

	/**
	 * @param index - The index to get the object from
	 * @return The object at the given index
	 */
	T get(int index);

	/**
	 * @param index - The index to set the object to
	 * @param o     - The object to be placed in the given index
	 */
	void set(int index, T o);

	/**
	 * @param index - The index in which the object will be removed from the list
	 */
	void remove(int index);

	/**
	 * @param o - The object to search for
	 * @return The index of the list where the object is found.
	 * -1 is returned if the element could not be found
	 */
	int indexOf(T o);


}
