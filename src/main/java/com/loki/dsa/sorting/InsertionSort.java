package com.loki.dsa.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] aar = {1,3,9,8,5,4,7,6,4,0,-2};
        insertionSort(aar);
        System.out.println(Arrays.toString(aar));
    }
    /**
     in insertion sort we will start sort from the left side and check its current element
     with prev element if current element is less then prev element then swap them
     */
     static void insertionSort(int[] arr) {
         for (int i = 0; i < arr.length-1; i++) {
             for (int j = i+1; j > 0; j--) {
                 if (arr[j] < arr[j-1]) {
                     int temp = arr[j];
                     arr[j] = arr[j-1];
                     arr[j-1] = temp;
                 }else{
                     break;
                 }

             }

         }
    }
}
