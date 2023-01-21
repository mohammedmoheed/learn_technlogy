package com.Moheed;
import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a=0;
        int b=1;
        for (int c=2; c<=n; c++){
            int temp = b;
            b= b + a;
            a = temp;
            System.out.println(b);
        }
       // System.out.println(b);

    }
}
