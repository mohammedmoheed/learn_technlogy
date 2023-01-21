package com.Moheed;
import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a=1;
        for (int i = n; i >0; i--) {
            a = a*i;

        }
        System.out.println(a);

    }
}
