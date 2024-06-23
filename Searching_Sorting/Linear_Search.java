package Searching_Sorting;
import java.util.Arrays;
public class Linear_Search {
    public static void main(String[] args) {
       int[] arr1 = {22,45,-56,32,67,-43,77,32,-673,113,63,632,-67,32,72};
       System.out.println("Array1 : "+Arrays.toString(arr1));
        System.out.println("63 in Array1 is at index "+linearSearch(arr1,63));
        System.out.println("99 in Array1 is at index "+linearSearch(arr1,101));
        String name = "Shivam";
        System.out.println("String Name : "+Arrays.toString(name.toCharArray()));
        System.out.println("Character 'a' found = "+linearSearch2(name,'a'));
        System.out.println("Character 'k' found = "+linearSearch2(name,'k'));
    }
    //search in the array
    //return the index if element is found otherwise if not found return -1
    static int linearSearch(int[] arr,int target) {
     if (arr == null) return -1;

     for(int index=0;index<arr.length;index++) {
         if (arr[index] == target) {
             return index;
         }
     }
     //if target is not found means element does not exist in array
     return -1;
    }
    static boolean linearSearch2(String str,char c){
        if(str.length()==0) {
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch==c) return true;
        }
        return false;
    }
}
