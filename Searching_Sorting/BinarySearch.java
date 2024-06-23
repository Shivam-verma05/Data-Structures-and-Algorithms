package Searching_Sorting;
import java.util.Arrays;

//In Binary Search Array ia in sorted Array (ascending or descending)
//Find the middle element
//if target>mid => Search in the right
// then start = mid+1
//if target<mid => Search in the left
// then end = mid-1
//if target==mid => Target found
//if start>end => Target not found

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr1 = {-32,-23,-5,0,5,78,91,230,533};
        System.out.println("Array1 : "+Arrays.toString(arr1));
        System.out.println("Target -5 found at index  "+binarySearch(arr1,-5));
        System.out.println("Target 230 found at index "+binarySearch(arr1,230));
        System.out.println("Target 177 found at index "+binarySearch(arr1,177));

    }
    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if  (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                // answer found
                return mid;
            }
        }
        // answer not found
        return -1;
    }
}

