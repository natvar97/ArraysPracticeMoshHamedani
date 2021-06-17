package com.Indialone;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers  = { 5 , 2 , 3 , 8 , 6  };
        var bubbleSort = new QuickSort();
        bubbleSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

}
