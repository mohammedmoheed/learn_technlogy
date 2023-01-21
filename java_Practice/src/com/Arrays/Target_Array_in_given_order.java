/*
* Given two arrays of integers nums and index. Your task is to create target array under the following rules:

Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.

It is guaranteed that the insertion operations will be valid.



Example 1:

Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]
Example 2:

Input: nums = [1,2,3,4,0], index = [0,1,2,3,0]
Output: [0,1,2,3,4]
Explanation:
nums       index     target
1            0        [1]
2            1        [1,2]
3            2        [1,2,3]
4            3        [1,2,3,4]
0            0        [0,1,2,3,4]*/

package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Target_Array_in_given_order {
    public static void main(String[] args) {
       int[] nums = {1,2,3,4,0};
       int[] index = {0,1,2,3,0};

        System.out.println(Arrays.toString(TargetArray(nums,index)));

    }
//    static int[] createTargetArray(int[] nums, int[] index) {
//        int n = nums.length;
//        int[] target = new int[n];
//        for(int i =0;i<n;i++){
//            if(index[i]>=i)
//                target[index[i]] = nums[i];
//            else{
//                for(int j =n-1;j>index[i];j--)
//                    target[j] = target[j-1];
//                    target[index[i]] = nums[i];
//            }
//        }
//        return  target;
//
//    }
    static int[] TargetArray(int[] nums, int[] index) {
        int length = nums.length;
        List<Integer> list = new ArrayList();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++)
            list.add(index[i], nums[i]);
        for (int i = 0; i < length; i++)
            arr[i] = list.get(i);
        return arr;
    }

}
