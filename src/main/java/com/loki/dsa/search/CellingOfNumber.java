package com.loki.dsa.search;

public class CellingOfNumber {
    public static void main(String[] args) {
    int [] arr = {1,5,8,10,13,35};
    int target = 9;
    System.out.println(celling(arr, target));
    }

    /*
    return the immediate greater number of the target
     */
    public static int celling(int[] arr, int target) {
        // what if there is no such number
        if (target > arr[arr.length-1])
            return -1;

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
         return start;
    }
}
