package com.Sorting;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble_sort(int[] arr){
        //this loop will run as counter how many element we have to sort
        boolean isSwapped;
        for (int i = 0; i < arr.length; i++) {
            // this loop will work for sorting
            isSwapped = false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped)
                break;
        }
    }
}
