/* Write a Java program to create a vehicle class hierarchy.
The base class should be Vehicle, with subclasses Truck, Car and Motorcycle.
Each subclass should have properties such as make, model, year, and fuel type. 
Implement methods for calculating fuel efficiency, distance travelled, and maximum speed. */

class Vehicle { 
    private String brand; 
    private int speed; 

    // Constructor
    Vehicle(String brand, int speed) { 
        this.brand = brand; 
        this.speed = speed; 
    }

    // vehicle details
    void details() { 
        System.out.println("Brand: " + brand); 
        System.out.println("Speed: " + speed); 
    } 
}

class Car extends Vehicle { 
    private int doors; 
    private int capacity; 

    // Constructor
    public Car(String brand, int speed, int doors, int capacity) { 
        super(brand, speed); 
        this.doors = doors; 
        this.capacity = capacity; 
    }

    // Method to display car details
    void carDetails() { 
        System.out.println("Number of doors: " + doors); 
        System.out.println("Capacity: " + capacity); 
    }

    // car details
    @Override 
    void details() { 
        super.details(); 
        carDetails(); 
    } 
}

class Bike extends Vehicle { 
    private boolean gears; 

    // Constructor
    Bike(String brand, int speed, boolean gears) { 
        super(brand, speed); 
        this.gears = gears; 
    }

    // Method to display bike details
    void bikeDetails() { 
        System.out.println(gears ? "This bike has gears." : "This bike does not have gear system."); 
    }

    // bike details
    @Override 
    void details() { 
        super.details(); 
        bikeDetails(); 
    } 
}

class Truck extends Vehicle { 
    private int tons; 

    // Constructor
    Truck(String brand, int speed, int tons) { 
        super(brand, speed); 
        this.tons = tons; 
    }

    // Method to display truck details
    void truckDetails() { 
        System.out.println("The capacity of the truck is: " + tons + " tons.");    
    }

    // truck details
    @Override 
    void details() { 
        super.details(); 
        truckDetails(); 
    } 
}

public class Main {
    public static void main(String[] args) { 
        System.out.println("G. POOJA PRIYANKA,24107,CSE-B");
        Car c = new Car("Toyota", 100, 5, 5); 
        c.details(); 

        Bike b = new Bike("KTM", 90, true); 
        b.details(); 

        Truck t = new Truck("TATA", 80, 1); 
        t.details(); 
    }
}