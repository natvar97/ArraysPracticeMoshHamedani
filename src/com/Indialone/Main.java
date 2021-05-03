package com.Indialone;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var stack = new Stack();
        stack.push(10);
        stack.push(2);
        stack.push(30);
//        int pop = stack.pop();
//        stack.pop();
//        stack.pop();
//        System.out.println(stack.peek());
//        System.out.println(pop);
        System.out.println(stack);
        System.out.println(stack.min());
    }
}
