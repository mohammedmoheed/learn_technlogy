package com.Arrays;

import java.util.Arrays;

public class First_and_last_position {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums,target)));

    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start = search(nums , target, true);
        int end = search(nums,target,false);
        ans[0] = start;
        ans[1] = end;
        return ans;

    }
     // this func return index of target
    static int search(int[] nums, int target, boolean fisrtindex){
        int s = 0;
        int e = nums.length - 1;
        int ans= -1;
        while(s<=e){
            int mid= s+(e-s)/2;
            if (target>nums[mid]) {
                s= mid +1;
            }
            else if ( target<nums[mid]) {
                e=mid-1;
            }
            // potential answer found but we have find first and last
            else {
                ans = mid;
                if(fisrtindex){
                    e = mid-1;
                }
                else s = mid+1;
            }
        }
        return ans;
    }
}


/*Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]*/