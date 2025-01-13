package com.loki.dsa.search;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class Leetcode_852_Peak_Index_in_a_Mountain_Array {
    public static void main(String[] args) {
    int [] arr = {0,1,2,4,3,2,0};
    System.out.println(search(arr));
    }

    /*
    return index if found
    return -1 if not found
     */
    public static int search(int[] arr) {
         int start = 0;
         int end  = arr.length-1;
         while(start<end){
             int mid = (start+end)/2;
              if (arr[mid] < arr[mid+1])
                  start = mid+1;
              else
                  end = mid;
         }
         return start;
    }
}

