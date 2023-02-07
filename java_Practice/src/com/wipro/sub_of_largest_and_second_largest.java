package com.wipro;

import java.util.Arrays;

public class sub_of_largest_and_second_largest {
    public static void main(String[] args) {
        int no1 = 1324;
        int no2 = 2345;
        int no3 = 6789;
        int[] No1 = num_array(no1);
        int[] No2 = num_array(no2);
        int[] No3 = num_array(no3);

        int res = (Lsearch(No1)+Lsearch(No2)+Lsearch(No3)) - (SLsearch(No1) - SLsearch(No2) - SLsearch(No3));
        System.out.println(res);

    }
    static int [] num_array(int num){
        String temp = Integer.toString(num);
        int[] newGuess = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            newGuess[i] = temp.charAt(i) - '0';
        }
        return newGuess;
    }
    static int Lsearch(int [] arr){
        for (int i = 0; i < 1; i++) {
            for (int j = 1; j < arr.length; j++) {

                if (arr[j-1]>arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr[arr.length -1];
    }
    static int SLsearch(int [] arr){
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < arr.length; j++) {

                if (arr[j-1]>arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr[arr.length -2];
    }

}
