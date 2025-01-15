package com.loki.dsa.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
     int[] arr = {23,3,4,5,6,3,0,-9,-4};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    /**
     * Selection Sort is a sorting algorithm that selects
     * the smallest (or largest, depending on the ordering) element from an unsorted
     * portion of the list and swaps it with the first unsorted element.
     * Then it selects the next smallest element and swaps it with the next unsorted element,
     * and so on.
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     */
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
