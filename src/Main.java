import collections.MyArrayList;
import collections.MyLinkedList;
import datastructures.MyStack;
import datastructures.MyQueue;
import datastructures.MyMinHeap;

/**
 * Demonstrates the usage of all data structures.
 */
public class Main {
    public static void main(String[] args) {
        // Test MyArrayList
        System.out.println("MyArrayList:");
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.addFirst(0);
        arrayList.removeLast();
        System.out.println("ArrayList elements: " + arrayList.toArray());
        System.out.println("Size: " + arrayList.size());

        // Test MyLinkedList
        System.out.println("\nMyLinkedList:");
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.addFirst(5);
        linkedList.removeLast();
        System.out.println("LinkedList elements: " + linkedList.toArray());
        System.out.println("Size: " + linkedList.size());

        // Test MyStack
        System.out.println("\nMyStack:");
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Size after pop: " + stack.size());

        // Test MyQueue
        System.out.println("\nMyQueue:");
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Peek: " + queue.peek());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Size after dequeue: " + queue.size());

        // Test MyMinHeap
        System.out.println("\nMyMinHeap:");
        MyMinHeap<Integer> minHeap = new MyMinHeap<>();
        minHeap.insert(10);
        minHeap.insert(20);
        minHeap.insert(5);
        minHeap.insert(30);
        System.out.println("Peek min: " + minHeap.peekMin());
        System.out.println("Extracted min: " + minHeap.extractMin());
        System.out.println("Size after extraction: " + minHeap.size());
    }
}