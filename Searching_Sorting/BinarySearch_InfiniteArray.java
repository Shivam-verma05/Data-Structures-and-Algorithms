package Searching_Sorting;
import java.util.Arrays;
// Apply Binary Search for infinite array
// we prefer not to use length function so that array is assumed to be infinite
// break given array in small chunks(blocks) and increase the size of chunk exponentially
// apply binarySearch in the chunk only where target is greater than end of previous chunk
public class BinarySearch_InfiniteArray {public static void main(String[] args) {
    int[] arr1 = new int[]{-32,-24, -23, -5, 0, 5, 78, 91,103,178,271,562,521,782,888,912,1937,56778};
    System.out.println("Array1 : "+Arrays.toString(arr1));
    System.out.println("Target 521 found at index  "+infinite_search(arr1,521));
    System.out.println("Target 912 found at index "+infinite_search(arr1,912));
    System.out.println("Target 72 found at index "+infinite_search(arr1,72));

}
    static int infinite_search(int[] arr,int target){
        // first find the range
        // first start with the box of size 2
        int start=0;
        int end=1;

        //condition for the target to lie in range
        while(target>arr[end]){
            int temp = end+1; // this is new start
            // double the box value
            // end = (previous end + sizeOfBox)*2
            // end + (end-start+1)*2 is not working but correct as showing ArrayIndexOutOfBoundsException
            // because while exponentially increasing the chunk end may go out of array in practical but correct for infinite array
            end = Math.min(end + (end-start+1)*2,arr.length-1);
            start = temp;
        }

        return binarySearch2(arr,target,start,end);
    }
    // return the index
    // return -1 if it does not exist
    static int binarySearch2(int[] arr, int target, int start ,int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if  (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                // answer found
                return mid;
            }
        }
        // answer not found
        return -1;
    }
}