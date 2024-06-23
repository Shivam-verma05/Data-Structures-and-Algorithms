package Basics;
public class FindNumber0fDigits {
    public static void main(String[] args) {
        System.out.println("No. of Digits in 0 is "+digits(0));
        System.out.println("No. of Digits in 34506462 is "+digits(34506462));
        System.out.println("No. of Digits in -27104 is "+digits(-27104));
    }
    static int digits(int num){
        if(num==0) return 1;
        if(num<0) num*=-1;
        return (int)(Math.log10(num))+1;
    }
}
