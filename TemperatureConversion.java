/* Write a program in java for converting temperature from celsius to fahrenheit */

import java.util.Scanner;

class TemperatureConversion {
	public static void main(String[] args) {
    Scanner temp = new Scanner(System.in);
	
    System.out.print("Enter temperature in Celsius: ");
        float ctemp = temp.nextFloat();
        float ftemp = (ctemp * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + ftemp);
		}
}
