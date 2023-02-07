package com.Moheed;
import java.util.*;

public class Sub_of_Mul_Add {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum=0;
        int mul=1;
        while (n>0){
            sum += n%10;
            mul *= n%10;
            n/=10;
        }
        System.out.println(sum);
        System.out.println(mul);
    }
}
