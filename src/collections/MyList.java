package collections;

import java.util.Iterator;

/**
 * Interface representing a generic list with basic operations.
 * Provides methods for adding, removing, accessing, and manipulating elements.
 *
 * @param <T> the type of elements in this list
 */
public interface MyList<T> extends Iterable<T> {
    /**
     * Appends the specified element to the end of the list.
     * @param item the element to be added
     */
    void add(T item);

    /**
     * Replaces the element at the specified position with the given element.
     * @param index the index of the element to replace
     * @param item the element to be stored at the specified position
     * @throws RuntimeException if the index is out of bounds (index < 0 || index >= size)
     */
    void set(int index, T item);

    /**
     * Inserts the specified element at the specified position.
     * @param index the index at which the element should be inserted
     * @param item the element to insert
     * @throws RuntimeException if the index is out of bounds (index < 0 || index > size)
     */
    void add(int index, T item);

    /**
     * Inserts the element at the beginning of the list.
     * @param item the element to add
     */
    void addFirst(T item);

    /**
     * Appends the element to the end of the list.
     * @param item the element to add
     */
    void addLast(T item);

    /**
     * Returns the element at the specified position.
     * @param index the index of the element to return
     * @return the element at the specified position
     * @throws RuntimeException if the index is out of bounds (index < 0 || index >= size)
     */
    T get(int index);

    /**
     * Returns the first element in the list.
     * @return the first element
     * @throws RuntimeException if the list is empty
     */
    T getFirst();

    /**
     * Returns the last element in the list.
     * @return the last element
     * @throws RuntimeException if the list is empty
     */
    T getLast();

    /**
     * Removes the element at the specified position.
     * @param index the index of the element to remove
     * @throws RuntimeException if the index is out of bounds (index < 0 || index >= size)
     */
    void remove(int index);

    /**
     * Removes the first element from the list.
     * @throws RuntimeException if the list is empty
     */
    void removeFirst();

    /**
     * Removes the last element from the list.
     * @throws RuntimeException if the list is empty
     */
    void removeLast();

    /**
     * Sorts the elements in ascending order (requires elements to implement Comparable).
     */
    void sort();

    /**
     * Returns the index of the first occurrence of the specified element.
     * @param object the element to search for
     * @return the index of the element, or -1 if not found
     */
    int indexOf(Object object);

    /**
     * Returns the index of the last occurrence of the specified element.
     * @param object the element to search for
     * @return the index of the element, or -1 if not found
     */
    int lastIndexOf(Object object);

    /**
     * Checks if the list contains the specified element.
     * @param object the element to search for
     * @return true if the element exists, false otherwise
     */
    boolean exists(Object object);

    /**
     * Returns an array containing all elements in the list.
     * @return an array of elements
     */
    Object[] toArray();

    /**
     * Removes all elements from the list.
     */
    void clear();

    /**
     * Returns the number of elements in the list.
     * @return the size of the list
     */
    int size();

    /**
     * Returns an iterator over the elements in the list.
     * @return an iterator
     */
    @Override
    Iterator<T> iterator();
}