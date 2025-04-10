/*  write a java program on Fibonacci series. */

import java.util.Scanner;
class fibonacci {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("enter the number of terms : ");
            int n =  input.nextInt(); 
            int f0 = 0, f1 = 1;
            System.out.println("Fibonacci Series up to " + n + " numbers:");
            
            for (int i = 1; i <= n; ++i) {
            System.out.print(f0+ " ");
            int fn = f0 + f1;
            f0 = f1;
            f1 = fn;
            }
    }
}
