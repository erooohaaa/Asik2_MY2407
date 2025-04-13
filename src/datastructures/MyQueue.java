package datastructures;

import collections.MyLinkedList;

/**
 * First-In-First-Out (FIFO) queue implementation using MyLinkedList.
 * Elements are added to the end and removed from the front of the list.
 */
public class MyQueue<T> {
    private MyLinkedList<T> list;

    public MyQueue() {
        list = new MyLinkedList<>();
    }

    /**
     * Adds an element to the end of the queue.
     * @param item the element to be enqueued
     */
    public void enqueue(T item) {
        list.addLast(item);
    }

    /**
     * Removes and returns the front element of the queue.
     * @return the removed element
     * @throws RuntimeException if the queue is empty
     */
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        T item = list.getFirst();
        list.removeFirst();
        return item;
    }

    /**
     * Returns the front element without removing it.
     * @return the front element
     * @throws RuntimeException if the queue is empty
     */
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return list.getFirst();
    }

    /**
     * Checks if the queue is empty.
     * @return true if empty, false otherwise
     */
    public boolean isEmpty() {
        return list.size() == 0;
    }

    /**
     * Returns the number of elements in the queue.
     * @return the size of the queue
     */
    public int size() {
        return list.size();
    }
}