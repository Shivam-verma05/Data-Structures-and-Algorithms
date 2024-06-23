package Basics.Bitwise;

public class FindIthBit {

    public static void main(String[] args) {
	    int number = 10;
        int bit = 4;
        System.out.println(findithbit(number,bit));
        System.out.println(setithbit(number,bit));
        System.out.println(resetithbit(number,bit));
    }

    private static int findithbit(int number, int bit) {
        int result = number & 1<<(bit-1);
        if(result!=0){
            return 1;
        }
        else{
           return 0;
        }
          
    }

    private static int setithbit(int number, int bit) {
        int result = number | 1<<(bit-1);
        return result ; 
    }

    private static int resetithbit(int number, int bit) {
        int result = number & ~(1<<(bit-1));
        return result ; 
    }
}