package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _2_Take_input_in_2D_array {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);

        int[][] arr2D = new int[3][3];
        for (int row = 0; row < arr2D.length; row++) {

            for (int col = 0; col < arr2D[row].length; col++) {
                arr2D[row][col] = s.nextInt();

            }

        }
        // output method1
        for (int row = 0; row < arr2D.length; row++) {
            System.out.println(Arrays.toString(arr2D[row]));

        }

        //  enhanced output method1
        for (int[] elemnt : arr2D) {
            System.out.println(Arrays.toString(elemnt));

        }
        // output method2
//        for (int row = 0; row < arr2D.length; row++) {
//
//            for (int col = 0; col < arr2D[row].length; col++) {
//                System.out.print(arr2D[row][col]);
//
//            }
//            System.out.println();
//
//        }

    }
}
