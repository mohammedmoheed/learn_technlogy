//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/
//google question

package com.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllMissing_Number {
    public static void main(String[] args) {
        int[] arr = {3,4,2,1,3};
        System.out.println(findDisappearedNumbers(arr));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if (nums[i] != nums[correct]) {
                swap(nums,i,correct);
            }
            else i++;
        }
        //we craeted the cyclic sort it will sort the array and duplicate value will be at last or at missing index
        //now we have to find missing element
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]!= j+1) {
                ans.add(j+1);
            }
        }
        return ans;

    }

    static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i]= nums[correct];
        nums[correct]= temp;
    }
}
