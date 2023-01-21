package com.playground;
import java.util.Scanner;
public class Program2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i <n*n; i++) {
            for(int j=0; j<n*n ; j++){
                if(j%n==n-((i%n)+1))
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}

