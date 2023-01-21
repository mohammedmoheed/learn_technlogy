package com.Sorting;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {5,4,2,1,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selection (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int max = getmax(arr, 0 ,last);
            swap (arr , max , last);
        }
    }

    private static void swap(int[] arr, int max, int last) {
        int temp = arr[last];
        arr[last] = arr[max];
        arr[max] = temp;
    }

    private static int getmax(int[] arr,int start, int end){
        int max  = start;
        for (int i = start; i < end; i++) {
            if (arr[i] > arr[max]) {
                max= i;
            }
        }
        return max;
    }
}
