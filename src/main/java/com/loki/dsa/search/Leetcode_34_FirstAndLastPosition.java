package com.loki.dsa.search;

/*
 https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
 */
public class Leetcode_34_FirstAndLastPosition {
    public static void main(String[] args) {
    int[] arr = {5,7,7,8,8,10};
    int target = 8;
    int[] op = searchRange(arr, target);
    System.out.println(" first index = "+op[0] +" last index = "+op[1]);
    }
    static int[] searchRange(int[] nums, int target) {
        int[] op = {-1,-1};
        int startIndex = search(nums, target, true);
        int endIndex = search(nums, target, false);
        op[0] = startIndex;
        op[1] = endIndex;
        return op;
    }
    static int search(int[] nums, int target,  boolean isFirstPart){
        int ans=-1;
        int start = 0;
        int end  = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if (target > nums[mid])
                start = mid+1;
            else if(target < nums[mid])
                end = mid-1;
            else {
                ans = mid;
                if(isFirstPart)
                    end = mid-1;
                else
                    start = mid+1;
            }
        }
        return ans;
    }
}
