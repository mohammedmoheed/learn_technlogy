package com.funcions;
import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a = s.nextInt();
        System.out.println(isPrime(a));
    }

    static boolean isPrime(int a) {
        if (a <=1) {
            return false;

        }
        for (int i = 2; i < a ; i++) {

            if(a%i==0){
                return false;
            }

        }return true;
    }
}
