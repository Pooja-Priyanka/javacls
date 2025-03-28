
import java.util.Scanner;

class AreaRectangle{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter length:");
		double length = input.nextDouble();
		System.out.println("enter width:");
		double width = input.nextDouble();
		double area = length*width;
		System.out.println("Area is "+area);
	}
}