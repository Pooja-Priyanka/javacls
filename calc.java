/* Create a calculator using the operations including addition, subtraction, multiplication, and division using multi-level inheritance and display the desired output. 
Hint: collect required variables using super class, create each class for a parameter and each class must contain a method. 
*/
public class calc {
    double num1, num2;

    // Constructor to initialize numbers
    public calc(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Addition class
    static class Addition extends calc {

        public Addition(double num1, double num2) {
            super(num1, num2);
        }

        // addition
        public double add() {
            return num1 + num2;
        }
    }

    // Subtraction class
    static class Subtraction extends Addition {

        public Subtraction(double num1, double num2) {
            super(num1, num2);
        }

        // subtraction
        public double subtract() {
            return num1 - num2;
        }
    }

    // Multiplication class
    static class Multiplication extends Subtraction {

        public Multiplication(double num1, double num2) {
            super(num1, num2);
        }

        // multiplication
        public double multiply() {
            return num1 * num2;
        }
    }

    // Division class
    static class Division extends Multiplication {

        public Division(double num1, double num2) {
            super(num1, num2);
        }

        //  division with condition for zero
        public String divide() {
            if (num2 != 0) {
                return String.valueOf(num1 / num2);
            } else {
                return "Error: Division by zero";
            }
        }
    }

    // main method to execute the calculator operations
    public static void main(String[] args) {
        // Create objects for each operation
        Addition add1 = new Addition(12, 6);
        Subtraction subtract1 = new Subtraction(12, 6);
        Multiplication multiply1 = new Multiplication(12, 6);
        Division divide1 = new Division(12, 6);

        // Displaying the results
        System.out.println("Addition: " + add1.add());     
        System.out.println("Subtraction: " + subtract1.subtract()); 
        System.out.println("Multiplication: " + multiply1.multiply()); 
        System.out.println("Division: " + divide1.divide());  
    }
}
