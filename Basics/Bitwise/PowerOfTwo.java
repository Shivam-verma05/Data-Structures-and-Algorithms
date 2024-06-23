package Basics.Bitwise;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(IsPowerOfTwo(8));
        System.out.println(IsPowerOfTwo(2));
    }

    private static boolean IsPowerOfTwo(int num){
        if (num == 0) {
            return false;
        }
        int counter = 0;
        while(num!=0){
            int x = num&1;
            if (x==1){
                counter++;
            }
            num = num >>> 1;
        }
        return counter==1;

        // Second Method
        // if ( num * (num-1) == 0 ) then num is power of 2 otherwise not
    }
}
