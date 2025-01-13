package com.loki.dsa.search;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//    int [] arr = {1,2,3,4,5,6,7,8,9,10};
    int[] arr = {10,9,8,7,6,5,4,3,2,1};
    int target = 5;
    System.out.println(OrderAgnosticBS(arr, target));
    }

    /*
    return index if found
    return -1 if not found
     */
    public static int OrderAgnosticBS(int[] arr, int target) {
        boolean isAsc = arr[0]<arr[arr.length-1];
         int start = 0;
         int end  = arr.length-1;
         while(start<=end){
             int mid = (start+end)/2;
             if(isAsc) {
                 if (target > arr[mid])
                     start = mid + 1;
                 else if (target < arr[mid])
                     end = mid - 1;
                 else
                     return mid;
             }
             else {
                 if (target > arr[mid])
                     end = mid - 1;
                 else if (target < arr[mid])
                     start = mid + 1;
                 else
                     return mid;
             }
         }
         return -1;
    }
}
