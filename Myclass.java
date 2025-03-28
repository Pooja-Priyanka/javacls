class Myclass {
    // Static variable to hold count of objects created
    static int count = 0; 

    // Constant variable for pi, initialized to 3.14
    final double pi = 3.14;

    // Constructor
    public Myclass() {
        // Increment count every time an object is created
        count++;
    }

    // Main method to create objects and print values
    public static void main(String[] args) {
        // Creating three objects of MyClass
        Myclass object1 = new Myclass();
        Myclass object2 = new Myclass();
        Myclass object3 = new Myclass();
        // Printing the final values of count and pi
        System.out.println("Final count of objects created: " + count);
        System.out.println("Value of pi: " + object1.pi);  // Pi is constant, and we can access it via any object
    }
}
