package Basics.Bitwise;

public class FindNthMagicNumber {
    public static void main(String[] args) {
        // Magic Number 1,2,3,4.. in binary and take its 1's bit as power of 5 instead of 2
        //   => 125  25 5 => Number
        // 1 =>  0   0  1 => 5
        // 2 =>  0   1  0 => 25
        // 3 =>  0   1  1 => 30
        // 4 =>  1   0  0 => 125
        // 5 =>  1   0  1 => 130 ..... and so on

        System.out.println("5th Magic Number is : "+magicNumber(5));
        
    }

    private static int magicNumber(int num){
        int ans = 0;
        int base = 5;

        while (num > 0) {
            int last = num & 1;
            num = num >> 1;
            ans += last * base;
            base = base * 5;
        }
        return ans;
    }

}
