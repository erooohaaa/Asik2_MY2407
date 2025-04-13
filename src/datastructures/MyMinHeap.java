package datastructures;

import collections.MyArrayList;

/**
 * Min-heap implementation using MyArrayList as the underlying storage.
 * Maintains the smallest element at the root.
 *
 * @param <T> the type of elements in this heap, must implement Comparable
 */
public class MyMinHeap<T extends Comparable<T>> {
    private MyArrayList<T> heap = new MyArrayList<>();

    /**
     * Inserts an element into the heap and restores the heap property.
     * Time complexity: O(log n)
     * @param item the element to insert
     */
    public void insert(T item) {
        heap.add(item);
        heapifyUp(heap.size() - 1);
    }

    /**
     * Removes and returns the smallest element from the heap.
     * Time complexity: O(log n)
     * @return the smallest element
     * @throws RuntimeException if the heap is empty
     */
    public T extractMin() {
        if (heap.size() == 0) throw new RuntimeException("Heap is empty");
        T min = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.removeLast();
        heapifyDown(0);
        return min;
    }

    /**
     * Returns the smallest element without removing it.
     * @return the smallest element
     * @throws RuntimeException if the heap is empty
     */
    public T peekMin() {
        if (heap.size() == 0) throw new RuntimeException("Heap is empty");
        return heap.get(0);
    }

    /**
     * Checks if the heap is empty.
     * @return true if empty, false otherwise
     */
    public boolean isEmpty() {
        return heap.size() == 0;
    }

    /**
     * Returns the number of elements in the heap.
     * @return the size of the heap
     */
    public int size() {
        return heap.size();
    }

    /**
     * Restores the heap property by moving the element upward.
     * @param index the starting index for heapify-up
     */
    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (heap.get(index).compareTo(heap.get(parentIndex)) >= 0) break;
            swap(index, parentIndex);
            index = parentIndex;
        }
    }

    /**
     * Restores the heap property by moving the element downward.
     * @param index the starting index for heapify-down
     */
    private void heapifyDown(int index) {
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int smallest = index;

        if (left < heap.size() && heap.get(left).compareTo(heap.get(smallest)) < 0) {
            smallest = left;
        }
        if (right < heap.size() && heap.get(right).compareTo(heap.get(smallest)) < 0) {
            smallest = right;
        }
        if (smallest != index) {
            swap(index, smallest);
            heapifyDown(smallest);
        }
    }

    /**
     * Swaps two elements in the heap.
     * @param i the index of the first element
     * @param j the index of the second element
     */
    private void swap(int i, int j) {
        T temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}