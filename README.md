# Custom Data Structures Implementation in Java

This project provides custom implementations of fundamental data structures in Java without using classes from `java.util.*` (except `Iterator`). It includes both core implementations (`MyArrayList`, `MyLinkedList`) and logical data structures (`MyStack`, `MyQueue`, `MyMinHeap`).

## Data Structures

### Core Implementations
1. **`MyArrayList`**  
   A dynamic array with automatic capacity expansion.  
   **Features**:
   - Amortized O(1) time for adding elements to the end.
   - Supports all methods from the `MyList` interface.

2. **`MyLinkedList`**  
   A doubly linked list.  
   **Features**:
   - O(1) time for adding/removing elements at the head/tail.
   - Bidirectional iteration support.

### Logical Data Structures
1. **`MyStack`** (LIFO)  
   Built on `MyArrayList` for efficient access to the last element.  
   **Methods**:
   - `push(T item)`, `pop()`, `peek()`, `size()`.

2. **`MyQueue`** (FIFO)  
   Uses `MyLinkedList` for efficient removal from the front.  
   **Methods**:
   - `enqueue(T item)`, `dequeue()`, `peek()`, `size()`.

3. **`MyMinHeap`**  
   A min-heap implementation based on `MyArrayList`.  
   **Methods**:
   - `insert(T item)`, `extractMin()`, `peekMin()`, `size()`.

## Requirements
- Java 8 or higher.
- Do **not** use classes from `java.util.*` (except `Iterator`).

