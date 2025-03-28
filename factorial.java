import java.util.Scanner;
class factorial {
    public static void main(String[] args) {
	Scanner f=new Scanner(System.in);
           System.out.println("enter the number: ");  
            int number=f.nextInt();
	long factorial = 1;
           for(int i = 1; i <= number; i++){
           factorial *= i;
        }
          System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
