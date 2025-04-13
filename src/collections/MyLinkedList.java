package collections;

import java.util.Iterator;

/**
 * Doubly-linked list implementation of the MyList interface.
 * Provides O(1) time complexity for add/remove operations at head/tail.
 *
 * @param <T> the type of elements in this list
 */
public class MyLinkedList<T> implements MyList<T> {
    private static class Node<T> {
        T data;
        Node<T> prev;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> head; // First node in the list
    private Node<T> tail; // Last node in the list
    private int size;     // Number of elements

    /**
     * Constructs an empty linked list.
     */
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void add(T item) {
        addLast(item);
    }

    @Override
    public void addFirst(T item) {
        Node<T> newNode = new Node<>(item);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    @Override
    public void addLast(T item) {
        Node<T> newNode = new Node<>(item);
        if (tail == null) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void add(int index, T item) {
        checkPositionIndex(index);
        if (index == 0) {
            addFirst(item);
        } else if (index == size) {
            addLast(item);
        } else {
            Node<T> current = getNode(index);
            Node<T> newNode = new Node<>(item);
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    @Override
    public T get(int index) {
        checkElementIndex(index);
        return getNode(index).data;
    }

    @Override
    public T getFirst() {
        checkNotEmpty();
        return head.data;
    }

    @Override
    public T getLast() {
        checkNotEmpty();
        return tail.data;
    }

    @Override
    public void set(int index, T item) {
        checkElementIndex(index);
        getNode(index).data = item;
    }

    @Override
    public void remove(int index) {
        checkElementIndex(index);
        Node<T> toRemove = getNode(index);
        unlink(toRemove);
    }

    @Override
    public void removeFirst() {
        checkNotEmpty();
        unlink(head);
    }

    @Override
    public void removeLast() {
        checkNotEmpty();
        unlink(tail);
    }

    private void unlink(Node<T> node) {
        if (node.prev == null) {
            head = node.next;
        } else {
            node.prev.next = node.next;
        }
        if (node.next == null) {
            tail = node.prev;
        } else {
            node.next.prev = node.prev;
        }
        size--;
    }

    private Node<T> getNode(int index) {
        Node<T> current;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) current = current.next;
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) current = current.prev;
        }
        return current;
    }

    @Override
    public int indexOf(Object obj) {
        Node<T> current = head;
        for (int i = 0; current != null; i++) {
            if (current.data.equals(obj)) return i;
            current = current.next;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object obj) {
        Node<T> current = tail;
        for (int i = size - 1; current != null; i--) {
            if (current.data.equals(obj)) return i;
            current = current.prev;
        }
        return -1;
    }

    @Override
    public boolean exists(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        Node<T> current = head;
        for (int i = 0; i < size; i++) {
            result[i] = current.data;
            current = current.next;
        }
        return result;
    }

    @Override
    public void sort() {
        if (size <= 1) return;

        for (int i = 0; i < size - 1; i++) {
            Node<T> current = head;
            for (int j = 0; j < size - 1 - i; j++) {
                Comparable<T> a = (Comparable<T>) current.data;
                T b = current.next.data;
                if (a.compareTo(b) > 0) {
                    T tmp = current.data;
                    current.data = current.next.data;
                    current.next.data = tmp;
                }
                current = current.next;
            }
        }
    }

    private void checkNotEmpty() {
        if (size == 0) {
            throw new RuntimeException("List is empty");
        }
    }

    private void checkElementIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }

    private void checkPositionIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index for insert: " + index);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }
}