package com.Indialone;

public class Tree {
    private Node root;

    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node = " + value;
        }
    }

    public void insert(int value) {
        var node = new Node(value);
        if (root == null) {
            root = node;
            return;
        }

        var current = root;

        while (true) {
            if (current.value > value) {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            }

            if (current.value < value) {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    public boolean find(int value) {
        var current = root;
        while (current != null) {
            if (value > current.value)
                current = current.rightChild;
            else if (value < current.value)
                current = current.leftChild;
            else
                return true;
        }
        return false;
    }


    public void traversePreOrder() {
        traversePreOrder(root);
    }

    private void traversePreOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }

    private void traverseInOrder(Node root) {
        if (root == null)
            return;

        traverseInOrder(root.leftChild);
        System.out.print(root.value);
        traverseInOrder(root.rightChild);
    }

    public void traversePostOrder() {
        traversePostOrder(root);
    }

    private void traversePostOrder(Node root) {
        if (root == null)
            return;

        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.print(root.value);
    }

    public int height() {
        return height(root);
    }

    private int height(Node root) {
        if (root == null)
            return -1;

        if (isLeaf(root))
            return 0;

        return 1 + Math.max(
                height(root.leftChild),
                height(root.rightChild));
    }

    //for binary search tree the min value is
    public int min() {
        if (root == null)
            throw new IllegalStateException();
        var current = root;
        var last = current;
        while (current != null) {
            last = current;
            current = current.leftChild;
        }
        return last.value;
    }

    //for binary search tree the max value is
    public int max() {
        if (root == null)
            throw new IllegalStateException();

        var current = root;
        var last = current;
        while (current != null) {
            last = current;
            current = current.rightChild;
        }
        return last.value;
    }

    private boolean isLeaf(Node node) {
        return root.leftChild == null && root.rightChild == null;
    }

    //min value for binary tree
    private int min(Node root) {
        if (isLeaf(root))
            return 0;
        var left = root.leftChild;
        var right = root.rightChild;
        return Math.min(Math.min(left.value, right.value), root.value);
    }

//    public int min() {
//        return min(root);
//    }

//    public int max() {
//        return max(root);
//    }

    //max value for binary tree
    private int max(Node root) {
        if (root == null)
            return 0;

        var left = root.leftChild;
        var right = root.rightChild;

        return Math.max(Math.max(left.value, right.value), root.value);
    }

    public boolean equals(Tree tree) {
        if (tree == null)
            return false;
        return equals(root, tree.root);
    }

    private boolean equals(Node first, Node second) {
        if (first == null && second == null)
            return true;

        // correct by me the if statement
        if (first != null && second != null) {
            return (first.value == second.value)
                    && equals(first.leftChild, second.leftChild)
                    && equals(first.rightChild, second.rightChild);
        }
        //correct by me
        return false;
    }


}
