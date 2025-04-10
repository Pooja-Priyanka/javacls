/* ) Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places (Use Conditional Statements).
Ex: Sample Input
Input floating-point number: 25.586
Input floating-point another number: 25.589
Expected Output :
They are different
 */

import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        System.out.println("G.POOJA PRIYANKA,24107,CSE-B");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1: ");
        double num1= sc.nextDouble();
        System.out.println("enter num2");
        double num2= sc.nextDouble();
        
        num1 = Math.round(num1 * 1000.0) / 1000.0;
        num2 = Math.round(num2 * 1000.0) / 1000.0;
        
        if (num1 == num2){
            System.out.println("they are equal");
        }
        else {
            System.out.println("they are different");
        }
    }
}
