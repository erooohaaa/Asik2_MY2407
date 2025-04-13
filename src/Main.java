import collections.MyArrayList;
import collections.MyLinkedList;
import datastructures.MyStack;
import datastructures.MyQueue;
import datastructures.MyMinHeap;

public class Main {
    public static void main(String[] args) {

        System.out.println("MyArrayList:");
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.addFirst(0);
        arrayList.removeLast();
        System.out.println("ArrayList: " + arrayList.toArray());
        System.out.println("Size: " + arrayList.size());


        System.out.println("\nMyLinkedList:");
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.addFirst(5);
        linkedList.removeLast();
        System.out.println("LinkedList: " + linkedList.toArray());
        System.out.println("Size: " + linkedList.size());


        System.out.println("\nMyStack:");
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Stack peek: " + stack.peek());
        System.out.println("Stack pop: " + stack.pop());
        System.out.println("Stack size after pop: " + stack.size());


        System.out.println("\nMyQueue:");
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Queue peek: " + queue.peek());
        System.out.println("Queue dequeue: " + queue.dequeue());
        System.out.println("Queue size after dequeue: " + queue.size());


        System.out.println("\nMyMinHeap:");
        MyMinHeap<Integer> minHeap = new MyMinHeap<>();
        minHeap.insert(10);
        minHeap.insert(20);
        minHeap.insert(5);
        minHeap.insert(30);
        System.out.println("MinHeap peek: " + minHeap.peekMin());
        System.out.println("MinHeap extractMin: " + minHeap.extractMin());
        System.out.println("MinHeap size after extractMin: " + minHeap.size());
    }
}
