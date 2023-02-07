package com.String;

public class String_learn {
    public static void main(String[] args) {
        int ans = (int) '1' - '0';
        System.out.println(ans);
        String num1 = "6913259244";
        String num2 = "71103343";
        String ans1 = convert_to_number(num2)+convert_to_number(num1)+"";
        System.out.println(ans1);
    }
    public static double convert_to_number(String s){
        int len = s.length();
        double value = 0;
        for(int i=0; i<len; i++){
            double num = (double) s.charAt(i)-'0';
            value=value*10 + num;
        }
        return value;
    }
}
