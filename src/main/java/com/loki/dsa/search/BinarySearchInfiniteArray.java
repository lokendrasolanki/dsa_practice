package com.loki.dsa.search;
/*
Asked in amazon
 */
public class BinarySearchInfiniteArray {
    public static void main(String[] args) {
    int [] arr = {1,2,3,4,5,6,7,8,9,10,23,45,60,70};
    int target = 45;
    System.out.println(answer(arr, target));

    }

    static  int answer(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(target>arr[end]){
            int newStart = end+1;
            end = end+(end-start+1)*2;
            start = newStart;

        }
        return search( arr, target, start, end);
    }
    /*
    return index if found
    return -1 if not found
     */
    public static int search(int[] arr, int target, int start, int end) {
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
