package Arrays;
import java.util.Arrays;

public class Find_Maximum {
    public static void main(String[] args) {
        int[] arr = {23,53,54,66,96,15,95};
        System.out.print("Array : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Maximum in the given Array : "+maximum(arr));
        System.out.print("Maximum in the given Array from index 0 to index 3 : "+maximum_range(arr,0,3));

    }
    static int maximum(int[] arr){
        if (arr.length==0)
            return -1;
       int max = arr[0];
        for (int j : arr) {
            if (max < j) max = j;
        }
        return max;
    }
    static int maximum_range(int[] arr,int start,int end){
        if (arr==null)
            return -1;

        if (end<start)
            return -1;

        int max = arr[start];
        for(int i=start; i<=end;i++){
            if(max<arr[i]) max=arr[i];
        }
        return max;
    }
}
