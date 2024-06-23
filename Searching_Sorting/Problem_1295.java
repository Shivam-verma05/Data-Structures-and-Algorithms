package Searching_Sorting;
import java.util.Arrays;
// 1295. Find Numbers with Even Number of Digits
// Given an array nums of integers, return how many of them contain an even number of digits.
//   Input: nums = [12,345,2,6,7896]
//   Output: 2
//   Input: nums = [555,901,482,1771]
//   Output: 1

public class Problem_1295 {
    public static void main(String[] args) {
        System.out.println("Input  : "+Arrays.toString(new int[]{12,345,2,6,7896}));
        System.out.println("Output : "+findNumbers1(new int[]{12,345,2,6,7896}));
        System.out.println("Input  : "+Arrays.toString(new int[]{555,901,482,-1771}));
        System.out.println("Output : "+findNumbers2(new int[]{555,901,482,-1771}));
        System.out.println("Input  : "+Arrays.toString(new int[]{555,0,2186,982134,-482,1771}));
        System.out.println("Output : "+findNumbers1(new int[]{555,0,2186,982134,-482,1771}));

    }
    //Method 1
        static int findNumbers1(int[] nums) {
            int count=0;
            for(int i=0;i<nums.length;i++){
                //for checking for negative numbers also
                if (nums[i]<0) nums[i]*=-1;
                if(even_digits(nums[i])) count++;
            }
            return count;
        }
        static boolean even_digits(int number){
            int digit=0;
            //if number is negative convert to positive
            if (number<0) number*=-1;
            //if number is 0 no digits so false
            if (number==0) return false;
            //counting number of digits in numbers
            while(number>0){
                digit++;
                number=number/10;
            }
            if(digit%2==0) return true;

            return false;
    }

    //Method 2
    static int findNumbers2(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (even_digits2(nums[i])) count++;
        }
        return count;
    }
    static boolean even_digits2(int number) {
        //if number is 0 return false as no digits
        if(number==0) return false;
        //makes number positive then converts to string and finds length
        return Integer.toString(Math.abs(number)).length() % 2 == 0;

    }
}

