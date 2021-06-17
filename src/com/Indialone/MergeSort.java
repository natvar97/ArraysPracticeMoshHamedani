package com.Indialone;

public class MergeSort {

    public void sort(int[] array) {

        if (array.length < 2)
            return;

        // find the middle of an array
        var middle = array.length / 2;

        // then divide array in two separate array from middle
        var left = new int[middle];

        for (var i = 0; i < middle; i++)
            left[i] = array[i];

        var right = new int[array.length - middle];

        for (var i = middle; i < array.length; i++)
            right[i - middle] = array[i];

        // divide separate arrays with recursive method

        sort(left);
        sort(right);

        // merge the arrays
        merge(left, right, array);

    }

    private void merge(int[] left, int[] right, int[] result) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j])
                result[k++] = left[i++];
            else
                result[k++] = right[j++];
        }

        while (i < left.length)
            result[k++] = left[i++];

        while (j < right.length)
            result[k++] = right[j++];

    }
}
