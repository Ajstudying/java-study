package ch09;

import java.util.LinkedList;

public class MyStack<T> {
    private LinkedList<T> stack;

    public MyStack() {
        stack = new LinkedList<>();
    }

    public void push(T item) {
        stack.addFirst(item);
    }

    public T pop() {
        return stack.removeFirst();
    }

    public T peek() {
        return stack.getFirst();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }
}