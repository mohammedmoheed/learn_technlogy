package com.Binary_Search;
// floor of number = smallest number <= target
public class Floor {
    public static void main(String[] args) {
        // for timer
        long startTime = System.currentTimeMillis();

        //main code
        int[] moh = {1,2,3,4,5,6,8};
        int find = 7;
        System.out.println(search(moh,find));

        //time counter
        long endTime = System.currentTimeMillis();
        System.out.println("process time is "+ (endTime - startTime) + " ms");
    }
    static int search(int[] arr, int target){
        int start=0;
        int end = arr.length-1 ;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target > arr[mid])
                start = mid+1;
            else if(target<arr[mid])
                end = mid-1;
            else return mid;
        }
        return end;
    }
}
