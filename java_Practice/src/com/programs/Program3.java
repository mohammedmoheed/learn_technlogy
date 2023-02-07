package com.programs;
import java.util.Scanner;
public class Program3 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i <n*n; i++) {
            for(int j=0; j<n*n ; j++){
               if((j/n)%2==0)
                   if(i%n==j%n)
                       System.out.print("*");
                   else System.out.print(" ");
               else
               if(j%n==n-((i%n)+1))
                   System.out.print("*");
               else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
