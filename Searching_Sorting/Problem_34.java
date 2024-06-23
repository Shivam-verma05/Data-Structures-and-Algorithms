package Searching_Sorting;

// 34. Find the first and last position of element in sorted array
// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1].
// You must write an algorithm with O(log n) runtime complexity.//   Input: nums = [12,345,2,6,7896]
// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]
// Input: nums = [], target = 0
// Output: [-1,-1]

import java.util.Arrays;

public class Problem_34 {
    public static void main(String[] args) {
        System.out.println("Input: nums = [5,7,7,8,8,10], target = 8");
        System.out.println("Output: "+ Arrays.toString(SearchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
        System.out.println("Input: nums = [5,7,7,8,8,10], target = 6");
        System.out.println("Output: "+ Arrays.toString(SearchRange(new int[]{5, 7, 7, 8, 8, 10}, 6)));
    }
    static int[] SearchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        // check for first occurrence if target first
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        // answer not found
        return ans;
    }
    // this function return the index value of target
    static int search(int[] nums, int target, boolean findStartIndex ){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if  (target > nums[mid]) {
                start = mid + 1;
            }
            else {
                // potential answer found
                ans = mid;
                if(findStartIndex){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}


