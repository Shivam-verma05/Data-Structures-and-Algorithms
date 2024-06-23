package Searching_Sorting;
import java.util.Arrays;
// Bubble Sort compares each adjacent element
// After each pass greatest element is placed at its correct position
// Also known as Sinking Sort / Exchange Sort
public class Bubble_Sort {
    public static void main(String[] args) {
       int[] arr = {56,52,21,0,43,76,-12,87,1,36,-69,27,82,80,-41,67,64,25,43};
        System.out.println("Given Array : "+Arrays.toString(arr));
        bubblesort(arr);
        System.out.println("Sorted Array : "+Arrays.toString(arr));
    }
    static void bubblesort(int[] arr){
        boolean is_swap_done = false;
        // run the steps (n-1) times
        for (int i=0;i<arr.length;i++){
            // for each pass, max element will come at the respective position
            for(int j=1;j<arr.length-i;j++){
                // swap the item if the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    // make swap done true
                    is_swap_done = true;
                }
            }
            // if you have not swap for particular value of i, it means array is sorted hence stop the program
            if(!is_swap_done) break; // is_swap_done==false
        }

    }
}
