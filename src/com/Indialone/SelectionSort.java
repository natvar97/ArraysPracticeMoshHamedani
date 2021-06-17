package com.Indialone;

public class SelectionSort {

    public void sort(int[] array) {
        // 8 , 5 , 3 , 9 , 1

        for (var i = 0; i < array.length; i++) {
            int minIndex = findMinIndex(array , i) ;
            swap(array , minIndex , i);
        }
    }

    private int findMinIndex(int[] array , int index) {
        int minIndex = index ;
        for (var j = index ; j < array.length ; j++) {
            if (array[j] < array[minIndex])
                minIndex = j;
        }
        return minIndex;
    }

    private void swap(int[] array, int index1, int index2) {
        var temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
    }

}
