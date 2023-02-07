/*
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].


*/
package com.Arrays;

import java.util.Arrays;

public class shuffle {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int n = 3;
        int[] ans = new int[nums.length];
        int k = 0;

        for (int i = 0, j = n; i < n && j < nums.length; i++, j++) {
            ans[k++] = nums[i];
            ans[k++] = nums[j];
        }
        System.out.println(Arrays.toString(ans));
    }
}
