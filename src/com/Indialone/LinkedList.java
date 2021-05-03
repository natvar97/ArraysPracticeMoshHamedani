package com.Indialone;

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node{
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addLast(int item) {
        var node = new Node(item);
        if (first == null){
            first = last = node;
        }
        else{
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst( int item ) {
        var node = new Node(item);
        if (first == null) {
            first = last = node;
        }
        if (first == last) {
            first.next = last;
            first = node;
        }
        Node temp = first;
        first = node;
        first.next = temp;
        size++;
    }

    public int indexOf(int item) {
        //variable index set it to zero
        //set current node to first
        //then make while loop and set condition : with current != null making loop
        //then set condition that if current.value is equals to item value then it return the index variable
        //if not equals to item value then increment the node to the next node and increment the index variable by one

        int index = 0;
        var current = first;

        while(current != null){
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return index;
    }

    public boolean contains(int item) {
        var current = first;
        while(current != null){
            if (current.value == item) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void removeLast() {
        var previous = getPrevious(last);
//        [ 10 -> 20 -> 30]
        last = previous;
        last.next = null;
        size--;
    }

    private Node getPrevious(Node node) {
        var current = first;

        while(current != null) {
            if (current.next == node) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void removeFirst() {
        // [ 10 -> 20 -> 30 ]
        if (first == null) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
            return;
        }
        var second = first.next;
        first.next = null;
        first = second;
        size--;
    }

    public int size(){
        return size;
    }

    public int[] toArray(){
        int[] array = new int[size];
        int count = 0;
        var current = first;
        while (current != null) {
            array[count++] = current.value;
            current = current.next;
        }

        return array;
    }

    public void reverse(){
        //[ 10 -> 20 -> 30 ]
        //[ 10 <- 20 <- 30 ]
        //[ 30 -> 20 -> 10 ]
        var current = first;
        int count = 0;
        Node second;
        int[] array = new int[size];
        while(current != null) {

            current = current.next;
        }
    }

}