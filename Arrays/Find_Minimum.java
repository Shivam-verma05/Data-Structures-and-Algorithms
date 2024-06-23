package Arrays;
import java.util.Arrays;

public class Find_Minimum {
    public static void main(String[] args) {
        int[] arr = {23,53,54,66,96,15,95};
        System.out.print("Array : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Minimum in the given Array : "+minimum(arr));
        System.out.print("Minimum in the given Array from index 0 to index 3 : "+minimum_range(arr,0,3));

    }
    static int minimum(int[] arr){
        if (arr.length==0)
            return -1;
        int min = arr[0];
        for (int j : arr) {
            if (min > j) min = j;
        }
        return min;
    }
    static int minimum_range(int[] arr,int start,int end){
        if (arr==null)
            return -1;

        if (end<start)
            return -1;

        int min = arr[start];
        for(int i=start; i<=end;i++){
            if(min>arr[i]) min=arr[i];
        }
        return min;
    }
}

