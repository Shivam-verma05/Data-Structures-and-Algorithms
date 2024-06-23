package Searching_Sorting;
import java.util.Arrays;

// 268. Missing Number
// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
//   Input: nums = [3,0,1]
//   Output: 2
//   Input: nums = [0,1,2]
//   Output: 3
//   Input: nums = [9,6,4,2,3,5,7,0,1]
//   Output: 8

public class Problem_268 {
    public static void main(String[] args) {
        System.out.println("Input  : "+Arrays.toString(new int[]{3,0,1}));
        System.out.println("Output : "+missingNumber(new int[]{3,0,1}));
        System.out.println("Input  : "+Arrays.toString(new int[]{0,1,2}));
        System.out.println("Output : "+missingNumber(new int[]{0,1,2}));
        System.out.println("Input  : "+Arrays.toString(new int[]{9,6,4,2,3,5,7,0,1}));
        System.out.println("Output : "+missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }
    static int missingNumber(int[] nums){
        for(int i=0;i<nums.length;){
            int element_index = nums[i];
            if(nums[i] < nums.length && nums[i]!= nums[element_index]){
                swap(nums,i,element_index);
            } else {
                i++;
            }
        }

        // search for the first missing number
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index){
                return index;
            }
        }
        // case 2
        return nums.length;
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
