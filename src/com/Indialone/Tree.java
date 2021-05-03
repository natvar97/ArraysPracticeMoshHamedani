package com.Indialone;

public class Tree {
    private Node root;
    private class Node {
        private int value;
        private Node leftChild ;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insert (int value) {
        if (root == null) {
            root.value = value;
        }

        var current = root;
        while (current.leftChild != null)

        if (value < root.value) {
            root.leftChild.value = value;
        }
        if (value > root.value) {
            root.rightChild.value = value;
        }
    }
}
