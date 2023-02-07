package com.Sorting;

import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr = {5,4,2,1,3};
        Insertion_Sort(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void Insertion_Sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr,j,j-1);
                }
            }
        }
    }
    static void swap(int[] arr, int first, int last) {
        int temp = arr[last];
        arr[last] = arr[first];
        arr[first] = temp;
    }
}
