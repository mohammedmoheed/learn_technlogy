package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _1_Take_input_in_array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();

        }

        // method 1 for printing the output

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }
        // enhanced method 1 for printing the output
        for (int elment : arr)
            System.out.println(elment);

        // method 2 for printing the output

        System.out.print(Arrays.toString(arr));
    }
}
