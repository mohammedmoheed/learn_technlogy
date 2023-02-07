package com.Binary_Search;

import java.util.Arrays;

public class search_in_2D_array {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}

        };
        int tar=5;
        int[] ans = matrix(arr, tar);
        System.out.println(Arrays.toString(ans));
    }
    static int[] matrix(int[][] array, int target){
        int r=0;
        int c = array[r].length-1;
        while(r< array.length && c>=0){

            if (array[r][c]==target)
                return new int[] {r,c};
            if(array[r][c]<target)
                r++;
            else c--;
        }
        return new int[] {-1,-1};
    }
}
