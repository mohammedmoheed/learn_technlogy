//https://leetcode.com/problems/find-the-duplicate-number/submissions/
//amazon question

package com.Sorting;

public class Duplicate_Number {
    public static void main(String[] args) {
        int[] arr = {3,4,2,1,3};
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i<nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }
            else i++;
        }
        //we craeted the cyclic sort it will sort the array and duplicate value will be at last or at missing index
        //now we have to find duplicate element
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1)
                return nums[j];
        }
        return -1;
    }
    static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
