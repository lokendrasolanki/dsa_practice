package com.loki.dsa.search;

public class FloorOfNumber {
    public static void main(String[] args) {
    int [] arr = {1,5,8,10,13,35};
    int target = 9;
    System.out.println(floor(arr, target));
    }

    /*
    return the immediate lesser number of the target
     */
    public static int floor(int[] arr, int target) {
        //what if there is no number is lesser tha the target
        if(target<arr[0])
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
         return end;
    }
}
