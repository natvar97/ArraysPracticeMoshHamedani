package com.Indialone;

import java.util.Arrays;

public class ArrayQueue {

    private int[] items;
    private int count = 0;
    private int front = 0;
    private int rear = 0;

    public ArrayQueue(int capacity) {
        items = new int[capacity];
    }


    public void enqueue(int item) {
        if (count == items.length)
            throw new IllegalStateException();

        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;

        // [ 0 , 0 , 30 , 40 , 50]
        //   0   1    2    3    4
        // 5 -> 0
        // 6 -> 1
        // 7 -> 2
        // 8 -> 3
        // 9 -> 4
        // 10 -> 0
        // 11 -> 1


    }

    public int dequeue() {
        if (count == items.length)
            throw new IllegalStateException();

        int item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return item;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }

}
