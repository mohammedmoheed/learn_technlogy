package com.Linear_Search;

import java.util.Arrays;

public class search_in_string {
    public static void main(String[] args) {
        String a = "moheed";
        char target = 'h';
        System.out.println(Arrays.toString(a.toCharArray()));
        System.out.println(search(a,target));
        System.out.println(search2(a,target));

    }
    // method 1
    static int search(String a, char target){
        for (int i = 0; i < a.length(); i++) {
            if(target == a.charAt(i)){
                return i;
            }
        }
        return -1;

    }
    // method 2
    static boolean search2(String a, char target){
        for(int ch : a.toCharArray()){
            if(target == ch ){
                return true;
            }
        }
        return false;

    }
}
