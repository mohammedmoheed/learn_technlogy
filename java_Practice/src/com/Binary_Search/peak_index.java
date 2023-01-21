package com.Binary_Search;

public class peak_index {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,2,1};
        System.out.println(search(arr));

    }
    static int search(int[] arr){
        int start=0;
        int end = arr.length-1 ;
        while(start<end) {
            int mid = start + (end - start) / 2;
            if(arr[mid]>arr[mid+1])
                end = mid;
            else if(arr[mid]<arr[mid+1])
                start = mid+1;

        }
        return arr[start];
    }
}
