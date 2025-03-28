import java.util.Scanner;

class SimpleInterest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Reading principal amount from user
        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();

        // Reading rate of interest from user
        System.out.print("Enter the rate of interest: ");
        double rate = input.nextDouble();

        // Reading time period from user
        System.out.print("Enter the time period (in years): ");
        double time = input.nextDouble();

        // Calculating simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Displaying the simple interest
        System.out.println("The simple interest is: " + simpleInterest);
    }
}
