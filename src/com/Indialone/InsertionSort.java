package com.Indialone;

public class InsertionSort {

    // mosh hamedani solution
    public void sort(int[] array) {
        for (var i = 1; i < array.length; i++) {
            var current = array[i];
            var j = i - 1;
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }


    /*      * this is my solution for insertion sort

            public void sort(int[] array) {
                // 8 , 5 , 2 , 6 , 3
                for (var i = 0; i < array.length; i++)
                    for (var j = 0; j < i; j++)
                        if (array[j] > array[i]) swap(array, j, i);
            }

            private void swap(int[] array, int index1, int index2) {
                var temp = array[index2];
                array[index2] = array[index1];
                array[index1] = temp;
            }

     */
}
