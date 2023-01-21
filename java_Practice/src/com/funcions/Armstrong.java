package com.funcions;
import java.util.*;


public class Armstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int a = s.nextInt();
//        System.out.println(isArmstrong(a));
        for (int i = 100; i < 1000; i++) {
            if(isArmstrong(i)){
                System.out.println(i);
            }

        }

    }

    static boolean isArmstrong(int a) {
        int original = a;
        int sum = 0;

        while(a>0){
            int rem = a%10;
            a = a/10;
            sum += rem*rem*rem;

        }
        return sum == original;
    }

}
