/*Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise (Use Conditional Statements).
Ex: Sample Output
Input first number: 1524
Input second number: 2345
Input third number: 3321
Expected Output :
Increasing order*/

import java.util.Scanner;

public class inc_dec {
    public static void main(String[] args) {
        System.out.println("G.POOJA PRIYANKA,24107,CSE-B");
        Scanner input = new Scanner(System.in);
        System.out.println("Input first number: ");
        int a = input.nextInt();
        System.out.println("Input second number: ");
        int b = input.nextInt();
        System.out.println("Input third number: ");
        int c = input.nextInt();
        
        if (a < b && b < c) {
            System.out.println("Increasing order");
        } 
        else if (a > b && b > c) {
            System.out.println("Decreasing order");
        } 
        else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
