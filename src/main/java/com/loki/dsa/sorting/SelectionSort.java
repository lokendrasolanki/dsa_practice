package com.loki.dsa.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
     int[] arr = {23,3,4,5,6,3,0,-9,-4};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxIndex = maxIndex(arr, last);
            // now swap max index with last index
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[last];
            arr[last] = temp;

        }
    }
    static int maxIndex(int[] arr, int end) {
        int max = 0;
        for (int i = 0; i <= end; i++) {
            if(arr[max] < arr[i])
                max = i;
        }
        return max;
    }
}
