package Arrays;
import java.util.Arrays;

public class Swapping {
    public static void main(String[] args) {
      int[] arr = {23,53,54,66,96,15,95};
      System.out.print("Array Before Swapping : ");
      System.out.println(Arrays.toString(arr));
      swap(arr,1,5);
      System.out.print("Array After Swapping : ");
      System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
