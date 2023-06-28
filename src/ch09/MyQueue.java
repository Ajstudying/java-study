package ch09;

import java.util.ArrayList;

public class MyQueue<T> {
    private ArrayList<T> queue;

    public MyQueue() {
        queue = new ArrayList<>();
    }

    public void enqueue(T item) {
        queue.add(item);
    }

    public T dequeue() {
        return queue.remove(0);
    }

    public T peek() {
        return queue.get(0);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }
}