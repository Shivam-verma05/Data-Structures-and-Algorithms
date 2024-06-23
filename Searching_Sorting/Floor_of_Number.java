package Searching_Sorting;
import java.util.Arrays;
// arr = [2,3,5,9,14,16,18] floor=> greatest number in array smaller or equal to target
// Floor (arr,target=14) => 14
// Floor (arr,target=15) => 14
// Floor (arr,target=4) => 3
// Floor (arr,target=9) => 9

// simply <start target end> if element is there
// if while loop terminates means < end target start> means ans is out of range
// return end instead of -1
public class Floor_of_Number {
    public static void main(String[] args) {
        int[] arr1 = {2,3,5,9,14,16,18};
        System.out.println("Array1 : "+Arrays.toString(arr1));
        System.out.println("Floor of 14 is "+floor(arr1,14));
        System.out.println("Floor of 15 is "+floor(arr1,15));
        System.out.println("Floor of 4 is "+floor(arr1,4));
        System.out.println("Floor of 9 is "+floor(arr1,9));
        System.out.println("Floor of 1 is "+floor(arr1,1));

    }
    // return the greatest number <= target
    static int floor(int[] arr, int target) {
        // but what if the target is smaller than the smallest number in the array
        if(target<arr[0]){
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
        return arr[end];
    }
}

