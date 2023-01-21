package com.Linear_Search;

import java.util.Arrays;

public class Search_In_2Darray {
    public static void main(String[] args) {
        int[][] arr = { {1,2,3},
                        {4,5,6},
                        {7,8,9}  };
        int target = 6;
        System.out.println(Arrays.toString(search(arr,target)));
        System.out.println(max(arr));
        System.out.println(min(arr));
    }
    static int[] search(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(target == arr[i][j])
                    return new int[]{i,j};
            }

        }
        return new int[]{-1, -1};
    }

    static int max(int[][] arr){
        int max= arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>max)
                    max = arr[i][j];
            }
        }
        return max;
    }

    static int min(int[][] arr){
        int min= arr[0][0];
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt < min)
                    min = anInt;
            }
        }
        return min;
    }
}
