package Searching_Sorting;
import java.util.Arrays;

// 852. Peak Index in a Mountain Array
// 162. Find Peak Element
// Also known as bitonic array as first increases and then decreases, so find the peak element or greatest element (return index)
// Ex: [1,2,3,5,7,6,3,2]
// An array arr is a mountain if the following properties hold:
// (a). arr.length >= 3
// (b). There exists some i with 0 < i < arr.length - 1 such that:
//  Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
//  You must solve it in O(log(arr.length)) time complexity.
//   Input: arr = [0,1,0]
//   Output: 1
//   Input: arr = [0,10,5,2]
//   Output: 1

public class Problem_852_162 {
    public static void main(String[] args) {
        System.out.println("Input: arr = [0,10,5,2]");
        System.out.println("Output: "+peakIndexInMountainArray(new int[]{0,10,5,2}));
        System.out.println("Input: arr = [1,3,4,5,8,23,67,86,53,45,41,21,17,12,9,7,6,5,3,2,1]");
        System.out.println("Output: "+peakIndexInMountainArray(new int[]{1,3,4,5,8,23,67,86,53,45,41,21,17,12,9,7,6,5,3,2,1}));
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
        if(arr[mid]>arr[mid+1]){
            // you are in descending (decreasing) part of array
            // this may be the ans, but look at left
            // this is why end != mid -1
            end = mid;
        } else {
            // you are in ascending (increasing) part of the array
            start = mid+1; // because we know that mid+1 element > mid element
        }
    }
        // in the end, start==end and pointing to the largest number because of the two checks above
        // start and end are always trying to find the max element in the above two checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        return start; // also return end; as both are same
    }
}
