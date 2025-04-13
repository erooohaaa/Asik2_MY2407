package datastructures;

import collections.MyArrayList;

public class MyStack<T> {
    private MyArrayList<T> list;

    public MyStack() {
        list = new MyArrayList<>();
    }

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        T item = list.get(list.size() - 1);
        list.removeLast();
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.getLast();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }
}
