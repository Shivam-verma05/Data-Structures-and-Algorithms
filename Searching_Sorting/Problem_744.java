package Searching_Sorting;
import java.util.Arrays;
// 744. Find Smallest Letter Greater Than Target
// You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
// Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.
//   Input: letters = ["c","f","j"], target = "a"
//   Output: "c"
//   Input: letters = ["c","f","j"], target = "c"
//   Output: "f"

public class Problem_744 {
    public static void main(String[] args) {
        System.out.println("Input  : "+Arrays.toString(new char[]{'c','f','j'}));
        System.out.println("Output : "+smallest_letter(new char[]{'c','f','j'},'a'));
        System.out.println("Input  : "+Arrays.toString(new char[]{'c','f','j'}));
        System.out.println("Output : "+smallest_letter(new char[]{'c','f','j'},'c'));
        System.out.println("Input  : "+Arrays.toString(new char[]{'c','f','j'}));
        System.out.println("Output : "+smallest_letter(new char[]{'c','f','j'},'j'));
    }

        static char smallest_letter(char[] letter, int target) {
            // but what if the target is greater than the greatest number in the array
            if(target>letter[letter.length-1]){
                return letter[0];
            }
            int start = 0;
            int end = letter.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < letter[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return letter[start % letter.length];
        }
    }
