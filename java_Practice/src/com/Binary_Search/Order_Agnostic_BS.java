package com.Binary_Search;

public class Order_Agnostic_BS {
    public static void main(String[] args) {
        int[] moh = {1,2,3,4,5,6,7,8};
        int find = 5;
        System.out.println(orderAgnoBS(moh,find));

    }
    static int orderAgnoBS (int[] arr, int target){
        int start=0;
        int end = arr.length - 1;

        boolean isascending =  arr[start] < arr[end];

        while(start<=end){
            int mid = start+(end-start)/2;

            if (arr[mid] == target)
               return mid;

            if(isascending){
                if(target > arr[mid])
                    start = mid+1;
                else
                    end = mid-1;
            }
            else{
                if(target < arr[mid])
                    start = mid+1;
                else
                    end = mid-1;
            }

        }
        return -1;
    }
}
