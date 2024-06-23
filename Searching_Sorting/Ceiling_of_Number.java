package Searching_Sorting;
import java.util.Arrays;
// arr = [2,3,5,9,14,16,18] ceiling=> smallest element in array greater or equal to target
// Ceiling (arr,target=14) => 14
// Ceiling (arr,target=15) => 16
// Ceiling (arr,target=4) => 5
// Ceiling (arr,target=9) => 9

// simply <start target end> if element is there
// if while loop terminates means < end target start> means answer is out of range
// return start instead of -1

public class Ceiling_of_Number {
    public static void main(String[] args) {
        int[] arr1 = {2,3,5,9,14,16,18};
        System.out.println("Array1 : "+Arrays.toString(arr1));
        System.out.println("Ceiling of 14 is "+ceiling(arr1,14));
        System.out.println("Ceiling of 15 is "+ceiling(arr1,15));
        System.out.println("Ceiling of 4 is "+ceiling(arr1,4));
        System.out.println("Ceiling of 9 is "+ceiling(arr1,9));
        System.out.println("Ceiling of 19 is "+ceiling(arr1,19));

    }
    // return the smallest number >=target
    static int ceiling(int[] arr, int target) {
        // but what if the target is greater than the greatest number in the array
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                // answer found
                return arr[mid];
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start];
    }
}

