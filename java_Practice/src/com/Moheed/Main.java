package com.Moheed;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("enter a number");
//        int rn = in.nextInt();
//        System.out.println("hi" + rn);

//        int i=10;
//        char f=20;
//        System.out.println(f*i);
        int n = in.nextInt();
        int  i=0;
        int[]arr = new int[n];
        for( i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        Integer[]newarr = new Integer[arr.length];
        for( i=0; i<arr.length; i++){
            newarr[i] = i-arr[i];
        }
        System.out.println(Arrays.toString(newarr));

        int min = Collections.min(Arrays.asList(newarr));
        System.out.println(min);
        int max = Collections.max(Arrays.asList(newarr));
        System.out.println(max);
        System.out.println(max-min);

    }
}
