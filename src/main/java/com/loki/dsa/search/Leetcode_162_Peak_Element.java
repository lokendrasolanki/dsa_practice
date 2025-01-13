package com.loki.dsa.search;

// https://leetcode.com/problems/find-peak-element/description/
public class Leetcode_162_Peak_Element {
    public static void main(String[] args) {
    int [] arr = {0,1,2,4,3,2,0};
    System.out.println(search(arr));
    }

    /*

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

