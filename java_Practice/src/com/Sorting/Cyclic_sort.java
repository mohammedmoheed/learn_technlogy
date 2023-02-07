package com.Sorting;

import java.util.Arrays;

public class Cyclic_sort {
    public static void main(String[] args) {
        int[] arr = {3,4,2,1,3};
        cyclic_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic_sort(int[] arr){
        int i = 0;
        while(i< arr.length){
            int correct = arr[i]-1;
            if (arr[i] != arr[correct] ) {
                swap(arr, i, correct);
            }
            else i++;
        }
    }
    static void swap(int[] arr, int first, int last) {
        int temp = arr[last];
        arr[last] = arr[first];
        arr[first] = temp;
    }
}
