package com.loki.dsa.search;

public class BinarySearch {
    public static void main(String[] args) {
    int [] arr = {1,2,3,4,5,6,7,8,9,10};
    int target = 5;
    System.out.println(search(arr, target));
    }

    /*
    return index if found
    return -1 if not found
     */
    public static int search(int[] arr, int target) {
         int start = 0;
         int end  = arr.length-1;
         while(start<=end){
             int mid = (start+end)/2;
              if (target > arr[mid])
                  start = mid+1;
              else if(target < arr[mid])
                  end = mid-1;
              else
                  return mid;
         }
         return -1;
    }
}
