package Arrays;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Arrays_Lecture {
    public static void main(String[] args) {
        int z = 0;
        Scanner in = new Scanner(System.in);
        //Arrays
        //datatype[] variable_name = new datatype[size];
        //datatype[] variable_name; declaration (occurs at compile-time)
        //variable_name = new datatype[size]; initialization (object creation in heap occurs at run-time)
        //It is a Dynamic Memory Allocation as memory allocation is done at run-time
        //1D-Array [2,6,8,9]
        int[] arr1 = new int[5];
        arr1[0] = 20;
        arr1[1] = 30;
        arr1[2] = 40;
        arr1[3] = 30;
        arr1[4] = 50;
        int[] arr2 = {15, 20, 39, 41, 54};
        int[] arr3 = new int[5];
        //input using for loop
        for (int i = 0; i < arr3.length; i++) {
            System.out.print("arr3[" + i + "] : ");
            arr3[i] = in.nextInt();
        }
        //printing arr3
        System.out.println("Elements in arr3 :");
        for (int i = 0; i < arr3.length; i++) {
            System.out.println("arr3[" + i + "] : " + arr3[i]);
        }
        //printing arr1 using for-each loop
        System.out.println("Elements in arr1 :");
        for (int num : arr1) {
            System.out.println("arr1[" + z + "] : " + num); //here num represents the element of the array
            z++;
        }
        //toString method to print arrays (easiest method)
        System.out.println(Arrays.toString(arr2));
        //modify content of array
        arr2[3] = 99;

        //2D-ARRAY (an array of arrays
        // 2 3
        // 6 8
        //Way of accessing element in 2D-Array
        //arr[0][1]=3;

        int[][] arr4 = new int[3][3];

        //Taking input in 2D-Arrays
        System.out.println("Give input for 2D-Array [3][3]: ");
        for (int row = 0; row < arr4.length; row++) {
            for (int col = 0; col < arr4[row].length; col++) {
                arr4[row][col] = in.nextInt();
            }
            System.out.print("\n");
        }

        System.out.println("2D-ARRAY");
        for (int row = 0; row < arr4.length; row++) {
            System.out.println(Arrays.toString(arr4[row]));
        }

        //Ragged Array (Array having varying numbers of elements in each column not as matrix)
        int[][] arr5 = {
                {4, 6, 2, 6},
                {5, 3},
                {2},
                {9, 0, 3}
        };
        System.out.println("2D- RAGGED ARRAY");
        for (int[] num : arr5) System.out.println(Arrays.toString(num));

        //Arraylist
        //(size of arraylist is dynamic that can be modified
        //Always pass wrapper class not primitives. Ex: Integer not int
        System.out.print("ArrayList : ");
        ArrayList<Integer> list1 = new ArrayList<>(5);
        list1.add(56);
        list1.add(66);
        list1.add(78);
        list1.add(53);
        list1.add(84);
        list1.add(45);
        list1.add(354);
        list1.add(35);
        list1.add(32);
        list1.add(63);
        System.out.println(list1);
        System.out.print(list1.contains(567));
        list1.set(0,12); //set changes the content arraylist_name.set(index,value);
        list1.remove(2); //removes the element arraylist_name.remove(index);
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();
        //Creating and taking user input and printing them
        System.out.print("Enter the number of elements in ArrayList : ");
        int elements = in.nextInt();
        for(int x=0;x<elements;x++){
            System.out.print("String "+(x+1)+" : ");
            list2.add(in.next());
        }
        for(int i=0;i<elements;i++){
            System.out.println(list2.get(i)+"  "); //passing index to get element printed
        }

        //ArrayList of ArrayList

        System.out.print("ArrayList of Arraylist : ");
        ArrayList<ArrayList<Integer>> list3 = new ArrayList<>();
        //initialization
        for(int i=0;i<3;i++) list3.add(new ArrayList<>());
        //add elements
        for(int i=0;i<3;i++) for(int j=0;j<3;j++) list3.get(i).add(in.nextInt());
        System.out.println(list3);
    }
}
