import java.util.Scanner;

class TemperatureConversion1 {
   	 public static void main(String[] args) {
        	Scanner input = new Scanner(System.in);
        	System.out.print("Enter temperature in Fahrenheit: ");
        	float ftemp = input.nextFloat();
        	float ctemp=(ftemp-32)*5/9;
        	System.out.println("Temperature in Celsius: " + ctemp);
   	}
}


