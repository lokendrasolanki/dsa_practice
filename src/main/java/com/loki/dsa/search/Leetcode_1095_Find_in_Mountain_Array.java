package com.loki.dsa.search;

//https://leetcode.com/problems/find-in-mountain-array/description/
public class Leetcode_1095_Find_in_Mountain_Array {
    public static void main(String[] args) {
    int[] arr = {0,5,3,1};
    int target = 1;
    /*
    Example 1:
    Input: mountainArr = [1,2,3,4,5,3,1], target = 3
    Output: 2
    Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
       */
    System.out.println(peakIndexInMountainArray(arr, target));
    }

    static int peakIndexInMountainArray(int[] arr, int target) {
     int peakElementIndex = peakElementIndexInArray(arr);

     int firstIndex = orderAgnosticBS(arr, target,0, peakElementIndex  );

     if(firstIndex != -1)
         return  firstIndex;
     else
         return orderAgnosticBS(arr, target, peakElementIndex+1, arr.length-1);

    }

    /*
    This function takes an array and a target and
    returns the index of the target if found else -1

    The function takes advantage of the property of
    mountain array that it first increases and then decreases

    We first find the peak of the array and then divide our search space
    into two halves. If the target is greater than the mid element
    then we search in the first half and if it is lesser than the mid element
    then we search in the second half
     */
    public static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start]<arr[end];
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
    static  int peakElementIndexInArray(int[] arr) {
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
