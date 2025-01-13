package com.loki.dsa.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] aar = {1,3,9,8,5,4};
        bubbleSort(aar);
        System.out.println(Arrays.toString(aar));
    }
    /**
     * Sorts the given array using the Bubble Sort algorithm.

     * Time Complexity: O(n^2) in the worst and average case,
     * where n is the number of elements in the array.
     * Best case time complexity is O(n) when the array is already sorted.

     * Space Complexity: O(1) as it only requires a constant amount of extra space.
     */
    static  void  bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean isSwap =  false;
            for(int j=1; j<arr.length-i;j++){
        //      check if current item is smaller then previous item then swap it
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    isSwap=true;
                }
            }
            if (!isSwap)
                break;
        }
    }
}
