/* Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name (Use Conditional Statements).
Ex: Sample Input
Input number: 3
Expected Output :
Wednesday
 */

import java.util.Scanner;

public class day {
    public static void main(String[] args) {
        System.out.println("G.POOJA PRIYANKA,24107,CSE-B");
        Scanner input = new Scanner(System.in);
        
        // Taking input from the user
        System.out.println("Input number: ");
        int number = input.nextInt();
        
        // Conditional statements 
        if (number == 1) {
            System.out.println("Monday");
        } 
        else if (number == 2) {
            System.out.println("Tuesday");
        } 
        else if (number == 3) {
            System.out.println("Wednesday");
        }
        else if (number == 4) {
            System.out.println("Thursday");
        } 
        else if (number == 5) {
            System.out.println("Friday");
        } 
        else if (number == 6) {
            System.out.println("Saturday");
        } 
        else if (number == 7) {
            System.out.println("Sunday");
        } 
        else {
            System.out.println("Invalid number.");
        }
    }
}