package com.funcions;
import java.util.*;
public class Palindrom {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b= s.nextInt();
        System.out.println(isPalindrom(b));
    }

    static boolean isPalindrom(int a) {
        int temp = a;
        int sum=0;

        while(a>0){
            int rem = a%10;
            a/=10;
            sum= sum*10 + rem;
        }
        return sum==temp;


    }
}
