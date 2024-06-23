package Basics;

import java.util.Scanner;
public class FirstProgram {
        public static void main(String[] args) {

            System.out.print("Hello Shivam , ");
            System.out.print("Your First Java Code.");

            System.out.println("You are in new line.");
// here println prints the statement then goes to next line , so see output carefully
            System.out.print("Java is amazing.");
            System.out.print("\nHere also you are in new line.\n");

// Triangle in single print statement
            System.out.println("*\n**\n***\n****\n*****");

            //Printing Command-Line Arguments
            // System.out.println(args[0]);
            // System.out.println(args[1]);

            //Taking Input in Java
//            Scanner input = new Scanner(System.in);
//            System.out.print("Enter a number : ");
//            int number = input.nextInt();
//            System.out.print("Enter a word : ");
//            String word = input.next();
//            System.out.print("Enter a Sentence : ");
//            boolean choice = input.nextBoolean();
//            System.out.println("Number is "+number);
//            System.out.println("Word is "+word);
//            System.out.println("Choice is "+choice);

            //Type Casting
            int num = (int)69.0244f;
            System.out.println(num);
            
            // range of byte is 256
            byte b1 = (byte)257;
            System.out.println(b1);

            //Automatic Promotions
            int c = 'A';
            System.out.println("A : "+c);
            
        }
}
