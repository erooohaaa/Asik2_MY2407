package datastructures;

import collections.MyArrayList;

/**
 * Last-In-First-Out (LIFO) stack implementation using MyArrayList.
 * Elements are added and removed from the end of the list.
 */
public class MyStack<T> {
    private MyArrayList<T> list;

    public MyStack() {
        list = new MyArrayList<>();
    }

    /**
     * Adds an element to the top of the stack.
     * @param item the element to be pushed
     */
    public void push(T item) {
        list.add(item);
    }

    /**
     * Removes and returns the top element of the stack.
     * @return the removed element
     * @throws RuntimeException if the stack is empty
     */
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        T item = list.get(list.size() - 1);
        list.removeLast();
        return item;
    }

    /**
     * Returns the top element without removing it.
     * @return the top element
     * @throws RuntimeException if the stack is empty
     */
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.getLast();
    }

    /**
     * Checks if the stack is empty.
     * @return true if empty, false otherwise
     */
    public boolean isEmpty() {
        return list.size() == 0;
    }

    /**
     * Returns the number of elements in the stack.
     * @return the size of the stack
     */
    public int size() {
        return list.size();
    }
}