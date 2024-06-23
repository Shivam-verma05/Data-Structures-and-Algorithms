package Searching_Sorting;
import java.util.Arrays;
// Searching in 2D Arrays without Linear Searching
// Given Array is sorted in row & col wise
public class Searching_2D_Array {
    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,30,40,50},
                {24,37,45,56,61},
                {31,48,59,60,71},
                {48,50,67,78,89}
        };
        System.out.println("Element 60 is at index : "+ Arrays.toString(search_2DArray(matrix,60)));
        System.out.println("Element 50 is at index : "+Arrays.toString(search_2DArray(matrix,50)));
        System.out.println("Element 92 is at index : "+Arrays.toString(search_2DArray(matrix,92)));

    }
    static int[] search_2DArray(int[][] matrix,int target){
        int row=0;
        int col=matrix.length -1;
        // Start Searching from 0th row and last col
        // if target is greater than element than increase row
        // if target is less than element than decrease the column
        // if found return the index of target
        // if not present in matrix return [-1,-1]
        while(row<matrix.length && col>=0){
            if (matrix[row][col]==target){
                return new int[]{row,col};
            }
            else if(matrix[row][col]<target){
                row++;
            } else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}

