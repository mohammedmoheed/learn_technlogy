package com.wipro;

import java.util.Arrays;
import java.util.Scanner;

public class Add_of_2num_k {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 5;
        int k = 9;
        int[] arr = {1,2,3,4,5};
//        for (int i = 0; i < n; i++) {
//            arr[i] = s.nextInt();
//        }
        System.out.println(Arrays.toString(two_num_equal_k(arr,k)));
    }
    static int[] two_num_equal_k(int[] arr, int k){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]+arr[j] == k) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

}
