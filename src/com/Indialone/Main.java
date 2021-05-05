package com.Indialone;

import java.util.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(6);
        tree.insert(1);
        tree.insert(8);
        tree.insert(9);
        tree.insert(10);

        System.out.println(tree.max());
        System.out.println(tree.min());
    }

}
