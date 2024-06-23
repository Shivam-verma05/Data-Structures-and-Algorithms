package Searching_Sorting;
import java.util.Arrays;


// When given number from range 1 to n use cyclic sort
// index = value-1;
// only one loop will be needed to sort the array
// 3 5 2 1 4  => i=0 , swap(index0,index2)
// 2 5 3 1 4  => i=0 , swap(index0,index1)
// 5 2 3 1 4  => i=0 , swap(index0,index4)
// 4 2 3 1 5  => i=0 , swap(index0,index3)
// 1 2 3 4 5  => i=0 , swap(index0,index3)
// then i=1,2,3,4 check all the elements are at its correct position according to the given condition

public class Cyclic_Sort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        System.out.println("Given Array : "+ Arrays.toString(arr));
        cyclicSort(arr);
        System.out.println("Sorted Array : "+Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr){
       for(int i=0;i<arr.length;){
           int element_index = arr[i]-1;
           if(arr[i]!=arr[element_index]){
               swap(arr,i,element_index);
           } else {
               i++;
           }
       }
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
