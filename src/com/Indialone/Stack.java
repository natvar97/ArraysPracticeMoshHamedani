package com.Indialone;

import java.util.Arrays;

public class Stack {

    int[] array = new int[5];
    int count = 0;


    public void push(int value) {
        if (count == array.length)
            throw new StackOverflowError();
        array[count++] = value;
    }

    public int pop() {
        if (count == 0)
            throw new StackOverflowError();
        count--;
        return array[count];
    }

    public int peek() {
        if (count == 0)
            throw new IllegalStateException();
        return array[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        var content = Arrays.copyOfRange(array, 0, count);
        return Arrays.toString(content);
    }

    public int min() {
        var content = Arrays.copyOfRange(array , 0 , count);
        int min = content[0];
        for (int value : content){
            if (min > value)
                min = value;
        }
        return min;
    }

}
