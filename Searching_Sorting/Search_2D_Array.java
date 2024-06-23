package Searching_Sorting;
import java.util.Arrays;
public class Search_2D_Array {
    public static void main(String[] args) {
        int[][] arr1 = {
                {32,66,42,1},
                {46,63},
                {12,89,34,7,91,21},
                {55,71,61}
        };
        System.out.println("2D-ARRAY : ");
        for (int row = 0; row < arr1.length; row++) {
            System.out.println(Arrays.toString(arr1[row]));
        }
        System.out.println("7 in 2D-ARRAY is at position : "+Arrays.toString(search(arr1,7)));
        System.out.println("54 in 2D-ARRAY is at position : "+Arrays.toString(search(arr1,54)));
    }
    static int[] search(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target)
                    return new int[]{row,col};
            }
        }
        return new int[]{-1,-1};
    }

}
