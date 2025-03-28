public class car1 {
    // Attributes
    String color;
    String brand;
    String fuelType;
    float mileage;

    // Constructor with parameters
    car1(String color, String brand, String fuelType, float mileage) {
        this.color = color;
        this.brand = brand;
        this.fuelType = fuelType;
        this.mileage = mileage;
    }

    // Declaring methods
    public void car1() {
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

public void displayDetails(){
    System.out.println("Color: " + color);
    System.out.println("Brand: " + brand);
    System.out.println("Fuel Type: " + fuelType);
    System.out.println("Mileage: " + mileage);
}

    // Main method
    public static void main(String[] args) {
        // Using the default constructor
        car1 c1 = new car1();
        c1.color = "Red";
        c1.brand = "Kia";
        c1.fuelType = "Diesel";
        c1.mileage = 24;

	car1 c2 = new car1();
        c2.color = "black";
        c2.brand = "hyundai";
        c2.fuelType = "Diesel";
        c2.mileage = 20;

	car1 c3 = new car1();
        c3.color = "grey";
        c3.brand = "BMW";
        c3.fuelType = "Diesel";
        c3.mileage = 30;

        c1.car1();
        c1.start();
        c1.stop();
        c1.service();
        c1.displayDetails();
        c2.displayDetails();
        c3.displayDetails();
    }
}
