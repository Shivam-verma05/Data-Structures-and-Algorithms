package Searching_Sorting;
import java.util.Arrays;
// Selection Sort first selects maximum/minimum element
// After selection it swaps the selected item with its correct position
public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {56,52,21,0,43,76,-12,87,1,36,-69,27,82,80,-41,67,64,25,43};
        System.out.println("Given Array : "+ Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Sorted Array : "+Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            // find max item in the remaining array and swap with the correct index
            int last = arr.length-i-1;
            int max_index = getMaxIndex(arr,0,last);
            swap(arr,max_index,last);
        }
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max =start;
        for(int i=0;i<end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
