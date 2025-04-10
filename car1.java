/* 1)write a java program with following instructions:
i.	Create a class with name car.
ii.	Create 4 attributes named(colour,brand,fueltype,mileage).
iii.	Create 3 methods named(start,stop,service).
iv.	Create 3 objects named c1,c2,c3.
v.	Create a constructor with parameters colours,brand,fueltype,mileage.
 */

public class car1 {
    // Attributes
    String color;
    String brand;
    String fuelType;
    float mileage;

    // Constructor with parameters
    public car1(String color, String brand, String fuelType, float mileage) {
        this.color = color;
        this.brand = brand;
        this.fuelType = fuelType;
        this.mileage = mileage;
    }

    // Declaring methods
    public void car() {
        System.out.println("Welcome to the store!");
    }

    public void start() {
        System.out.println("The car is started");
    }

    public void stop() {
        System.out.println("The car is stopped");
    }

    public void service() {
        System.out.println("The car is serviced");
    }

    public void displayDetails() {
        System.out.println("Color: " + color);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Mileage: " + mileage);
    }

    // Main method
    public static void main(String[] args) {
        // Using the parameterized constructor
        car1 c1 = new car1("Red", "Kia", "Diesel", 24);
        car1 c2 = new car1("Black", "Hyundai", "Diesel", 20);
        car1 c3 = new car1("Grey", "BMW", "Diesel", 30);

        // Calling methods on c1
        c1.car();
        c1.start();
        c1.stop();
        c1.service();
        
        c1.displayDetails();
        c2.displayDetails();
        c3.displayDetails();
    }
}
