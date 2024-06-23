package String;
import java.util.Arrays;
import java.lang.String;
public class Palindrome_String {
    public static void main(String[] args) {
        System.out.println("String 'Shivam' is palindrome : "+ispalindrome("Shivam"));
        System.out.println("String 'Radar' is palindrome : "+ispalindrome("Radar"));
    }
    static boolean ispalindrome(String str) {
        String s = str.toLowerCase();
        if (s == null || s.length() == 0) {
            return true;
        }
        for (int i = 0; i <= s.length() / 2; i++) {
            char start = s.charAt(i);
            char end = s.charAt(s.length() - 1 - i);
            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
