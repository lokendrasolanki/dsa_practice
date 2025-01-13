package com.loki.dsa.search;

//https://www.geeksforgeeks.org/problems/rotation4723/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
public class GFG_RotationCount {
    public static void main(String[] args) {
    int [] arr = {4,5,6,7,0,1,2};
    int target = 0;
    /*
    Input: nums = [4,5,6,7,0,1,2], target = 0
    Output: 4
     */
    System.out.println(searchInRotatedArray(arr, target));
    }
   static int searchInRotatedArray(int[] arr, int target) {
       int pivotIndex = findPivotForDuplicateElement(arr);
       return pivotIndex+1;


   }
    /*
    this function will return pivot no(highest no). index of the array
     */
    static int findPivot(int[] arr) {
        int start = 0;
        int end  = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            // when my mid+1 element is greater then then my mid element is the pivot no.
            // Because array is sorted array in ascending order and that mid, mid+1 element is the only one in descending order
            if((mid<end) && (arr[mid]>arr[mid+1]))
                return mid;
            // when my mid-1 element is greater then then my mid element is the pivot no.
            // Because array is sorted array in ascending order and that mid, mid-1 element is the only one in descending order
            if ((mid>start)&& (arr[mid]<arr[mid-1]))
                return mid-1;
            // When my start element is greater then mid element then my answer lies in  the first half of the array
            // Because i need to find out the pivot(largest element) Which will definitely come under the first-half of the array
            //then update end as mid-1
            if(arr[mid] <= arr[start])
                end = mid-1;
                // if start element id greater then mid element then
                // we have to check another half of the array which will be in the second half of the array
                // then we will update start as mid+1 (arr[mid] > arr[start])
            else
                start = mid+1;

        }
        return -1;
    }

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

    /*
   this function will return pivot no(highest no). index of the array
    */
    static int findPivotForDuplicateElement(int[] arr) {
        int start = 0;
        int end  = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            // when my mid+1 element is greater then then my mid element is the pivot no.
            // Because array is sorted array in ascending order and that mid, mid+1 element is the only one in descending order
            if((mid<end) && (arr[mid]>arr[mid+1]))
                return mid;
            // when my mid-1 element is greater then then my mid element is the pivot no.
            // Because array is sorted array in ascending order and that mid, mid-1 element is the only one in descending order
            if ((mid>start)&& (arr[mid]<arr[mid-1]))
                return mid-1;

            if (arr[mid] == arr[start] && arr[mid] == arr[end]){
                // when my start element is greater then mid element then my answer lies in  the first half of the array
                // what if my start or end element are the pivots
//                lets check it
                if (arr[start]>arr[start+1]) {
                    return start;
                }
                start++;

                if(arr[end]<arr[end-1]){
                    return  end-1;
                }
                    end--;
            }
          // check pivot in right because left side is sorted
            if(arr[start]<arr[mid]||(arr[start]==arr[mid] && arr[mid]>arr[start])){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

}
