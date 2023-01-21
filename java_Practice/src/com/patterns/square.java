package com.patterns;

public class square {
    public static void main(String[] args) {
        square_pattern(4);

    }
    static void square_pattern (int n){
        for (int row = 1; row <2*n ; row++) {
            if (row <=n){
                for (int col = 1; col <= row ; col++) {
                    System.out.print("* ");
                }
            }
            else {
                for (int col = 1; col <= 2*n-row ; col++) {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }

}
