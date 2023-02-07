package com.Binary_Search;

public class search_in_Infinite_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int find= 7;
        System.out.println(chunk(arr,find));
    }

    static int chunk (int[] arr, int target ){
        // starting a chunk
        int s=0, e=1;
        // doubling a chunk
        while(target>arr[e]){
            int newstart = e+1;
            // end = end + size of box *2
            e = e + (e-s+1) * 2;
            s= newstart;
            if (e > arr.length) {
                e= arr.length-1;
            }

        }
        return binsrysearch(arr, target,s, e);
    }
    static int binsrysearch(int[] array,int target,int s, int e ){

        while(s<=e){
            int mid = s+(e-s)/2;
            if(target > array[mid])
                s=mid+1;
            else if (target<array[mid])
                e = mid-1;
            else return mid;
        }
        return -1;
    }
}
