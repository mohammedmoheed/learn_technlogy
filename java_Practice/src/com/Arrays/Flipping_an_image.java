//https://leetcode.com/problems/flipping-an-image/

package com.Arrays;
import java.util.Arrays;

public class Flipping_an_image {
    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] arr2= flipAndInvertImage(arr);
        for (int[] elemnt : arr2) {
            System.out.println(Arrays.toString(elemnt));
        }

    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for (int i=0; i<image.length; i++){
            int s=0, e =image[i].length-1;
            while(s<=e){
                int temp = image[i][s];
                image[i][s] = image[i][e];
                image[i][e]= temp;
                s++;
                e--;
            }
            for(int j =0; j< image[i].length; j++){
                image[i][j] = (image[i][j] == 0) ? 1 : 0;
            }
        }
        return image;
    }
}

/*Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].


Example 1:

Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]*/
