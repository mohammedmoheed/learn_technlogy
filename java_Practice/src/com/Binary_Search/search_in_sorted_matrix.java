package com.Binary_Search;

import java.util.Arrays;

public class search_in_sorted_matrix {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}

        };
        int tar= 9;
        int[] ans = search(arr,tar);
        System.out.println(Arrays.toString(ans));

    }
    static int[] binarysearch (int[][] matrix, int row, int cstart, int cend, int target){
        // it is searching in our remaing parts so it will sdearching in row from a col no to another col number
        while(cstart<=cend){
            int mid = cstart+(cend-cstart)/2;
            if(matrix[row][mid] == target)
                return new int[] {row,mid};
            if(matrix[row][mid] < target)
                cstart = mid+1;
            else
                cend = mid -1;

        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (rows == 1) {
            return binarysearch(matrix,0,0,cols-1,target);
        }
        // run the loop till two rows are remaining
        int rstart =0;
        int rend = rows-1;
        int cmid= cols/2;
        while ( rstart<(rend-1)){// while this is true it has more than two rows which we have to eliminate
            int mid = rstart + (rend - rstart)/2;
            if(matrix[mid][cmid]== target)
                return new int[]{mid,cmid};
            if(matrix[mid][cmid] < target)
                rstart = mid+1;
            if(matrix[mid][cmid] > target)
                rend = mid -1;

        }
        // now we have two rows

        // check wether target is in the col of two rows
        if(matrix[rstart][cmid]==target)
            return new int[]{rstart,cmid};
        if(matrix[rstart+1][cmid]==target)
            return new int[]{rstart+1,cmid};

        // search in first half
        if (target<=matrix[rstart][cmid-1])
            return binarysearch(matrix,rstart,0,cmid-1,target);

        // search in secnd
        if (target>=matrix[rstart][cmid+1] && target<=matrix[rstart][cols-1])
            return binarysearch(matrix,rstart,cmid+1,cols-1,target);

        // search in third half
        if (target<=matrix[rstart+1][cmid-1])
            return binarysearch(matrix,rstart+1,0,cmid-1,target);

        // search in fourth half
        else
            return binarysearch(matrix,rstart+1,cmid+1,cols-1,target);

    }
}
