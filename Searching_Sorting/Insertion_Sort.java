package Searching_Sorting;
import java.util.Arrays;
/**
 * Insertion Sort inserts the element at which it is present to the LHS already sorted sub-Array
 * Steps of swapping are reduced as loop breaks when no swapping is done as it always inserts the element in sorted array
 * Best Case Time Complexity : O(n)
 * Worst Case Time Complexity : O(n^2)
 */
public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {56,52,21,0,43,76,-12,87,1,36,-69,27,82,80,-41,67,64,25,43};
        System.out.println("Given Array : "+ Arrays.toString(arr));
        InsertionSort(arr);
        System.out.println("Sorted Array : "+Arrays.toString(arr));
    }
    static void InsertionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){ // because for i=arr.length-1 also the array is sorted so no need to check or swap
            for(int j=i+1;j>0;j--){ // here j is the just next element to the sorted array which keeps checking with just adjacent LHS element in sorted array
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1); // swaps if element is smaller
                } else{
                    break; // breaks as no comparison is needed after checking just next element as the elements to LHS are already sorted so they are placed in order already
                }
            }
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
