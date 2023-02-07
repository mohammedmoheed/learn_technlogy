package com.String;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class possible_string_from_list {
    public static void main(String[] args) {
        String input1 = "EAR";
        String[] input2 = {"ARE","BAT","CAT", "CAN", "EYE", "ERA","RAE", "REA", "EAR", "EEE"};
        String[] ans = similar(input1, input2);
        System.out.println(Arrays.toString(ans));
    }
    public static String[] similar(String input1, String[] input2){
        char[] char_arr = new char[input1.length()];
        for (int i = 0; i < input1.length(); i++) {
            char_arr[i] = input1.charAt(i);
        }
        List<String> ans = new LinkedList<String>();

        for (int i = 0; i <input2.length ; i++) {
            if (check_element(input2[i],char_arr)) {
                ans.add(input2[i]);
            }
        }
        String[] fianl_ans = new String[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            fianl_ans[i] = ans.get(i);
        }
        return fianl_ans;
    }
    public static boolean check_element(String s, char[] arr){
        int i=0;
        int j=0;
        while(j<arr.length) {
            if (s.charAt(i) == arr[j]) {
                i++;
                j = 0;
                if (i >= s.length()) {
                    return true;
                }
            } else {
                j++;
            }
        }
        return false;
    }

}
