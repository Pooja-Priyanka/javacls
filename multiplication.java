/* ) Write a Java program to display the multiplication table of a given integer.
Ex: Sample Input
Input the number (Table to be calculated) : Input number of terms : 5
Expected Output :
5 X 0 = 0                                                                        
5 X 1 = 5                                                                        
5 X 2 = 10                                                                       
5 X 3 = 15                                                                       
5 X 4 = 20                                                                       
5 X 5 = 25
 */

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        System.out.println("G. POOJA PRIYANKA,24107,CSE-B");
        Scanner input = new Scanner(System.in);

        // number to be multiplicated
        System.out.println("multiplication number: ");
        int number = input.nextInt();

        // number of terms
        System.out.println("number of terms: ");
        int terms = input.nextInt();

        // Display the multiplication table
        for (int i = 0; i <= terms; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
        }
    }
}
