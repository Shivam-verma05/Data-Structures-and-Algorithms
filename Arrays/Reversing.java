package Arrays;
import java.util.Arrays;

public class Reversing {
    public static void main(String[] args) {
        int[] arr1 = {23,53,54,66,96,15,95};
        int[] arr2 = {23,53,54,66,96,15,95,21};
        System.out.print("Odd Array Before Reversing : ");
        System.out.println(Arrays.toString(arr1));
        reverse(arr1);
        System.out.print("Odd Array After Reversing : ");
        System.out.println(Arrays.toString(arr1));
        System.out.print("Even Array Before Reversing : ");
        System.out.println(Arrays.toString(arr2));
        reverse(arr2);
        System.out.print("Even Array After Reversing : ");
        System.out.println(Arrays.toString(arr2));
    }
    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
