package com.funcions;
import java.util.*;
public class min_max {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println("max is "+ max(a,b,c));
        System.out.println("min is " + min(a,b,c));
    }
    static int max(int a, int b, int c){
        int max = a;
        if(b>max)
            max = b;
        if(c>max)
            max=c;
        return max;

    }
    static int min(int a, int b, int c){
        int min = a;
        if(b<min)
            min = b;
        if(c<min)
            min=c;
        return min;

    }
}
