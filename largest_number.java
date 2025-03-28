import java.util.Scanner;
class largest_number{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("enter the first number:");
	int a=input.nextInt();
	System.out.println("enter the second number:");
	int b=input.nextInt();
	System.out.println("enter the third number:");
	int c=input.nextInt();
	int largest_number = ((a > b && a > c)? a: (b > a && b>c)?b :c);
	System.out.println(" Largest number among three is:" + largest_number);
}
}
