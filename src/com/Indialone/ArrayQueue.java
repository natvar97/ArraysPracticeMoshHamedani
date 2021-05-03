package com.Indialone;

import java.util.Arrays;

public class ArrayQueue {

    private int[] items;
    int count = 0;
    int front = 0;
    int rear = 0;

    public ArrayQueue(int capacity) {
        items = new int[capacity];
    }


    public void enqueue(int item) {
        if (count == items.length)
            throw new IllegalStateException();

        items[rear++] = item;
        count++;
    }

//    public int dequeue() {
//
//    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }

}
