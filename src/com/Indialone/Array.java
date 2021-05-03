package com.Indialone;

import java.util.NoSuchElementException;

public class Array {
    //creating Array class
    //methods -  insert , removeAt , print() , indexOf
    private int count = 0 ;
    private int[] items ;

    public Array(int length) {
        this.items = new int[length];
    }

    public void removeAt( int index ) {
        //[10 , 20 , 40 , 50 ]
        // first - find the element at given index
        // then shift all items at the right ..to the left

        //checking that if index is out of bound
        if (index >= count || index < 0) {
            throw new NoSuchElementException();
        }

        //assigning
        for ( int i = index ; i < count ; i++ ) {
            items[i] = items[i+1];
        }
        count--;
    }

    public void print(){
        //using for loop we can access all the elements of an items Array
        for (int i = 0 ; i < count ; i++)
            System.out.println(items[i]);
    }

    public void insert(int item) {
        // [ 10 , 20 , 30 ]
        if (items.length == count) {
            //create a new array
            int[] newArray = new int[count * 2];

            //copy all the items in new array
            for (int i = 0 ;  i < count ; i++)
                newArray[i] = items[i];

            //assign this new array to old array
            items = newArray;
        }
        items[count++] = item;
    }

    public int indexOf(int item) {
        for (int i = 0 ;  i < count ; i++) {
            if (items[i] == item){
                return i;
            }
        }
        return -1;
    }
}
