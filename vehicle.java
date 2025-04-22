/*write a Java program to create a vehicle class hierarchy.
The base class should be Vehicle, with subclasses Truck, Car and Motorcycle.
Each subclass should have properties such as make, model, year, and fuel type. 
Implement methods for calculating fuel efficiency, distance travelled, and maximum speed. */

public class vehicle {
    String brand;
    String model;
    int year;
    String fuelType;

    vehicle(String brand, String model, int year, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year + ", Fuel Type: " + fuelType);
    }

    double calculateFuelEfficiency() {
        return 0.0;
    }

    double calculateDistance(double fuelUsed) {
        return fuelUsed * calculateFuelEfficiency();
    }

    double getMaxSpeed() {
        return 0.0;
    }
}

class Car extends vehicle {
    Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year, fuelType);
    }

    double calculateFuelEfficiency() {
        return 18.0;
    }

    double getMaxSpeed() {
        return 180.0;
    }
}

class Truck extends vehicle {
    Truck(String brand, String model, int year, String fuelType) {
        super(brand, model, year, fuelType);
    }

    double calculateFuelEfficiency() {
        return 7.0;
    }

    double getMaxSpeed() {
        return 100.0;
    }
}

class Motorcycle extends vehicle {
    Motorcycle(String brand, String model, int year, String fuelType) {
        super(brand, model, year, fuelType);
    }

    double calculateFuelEfficiency() {
        return 35.0;
    }

    double getMaxSpeed() {
        return 160.0;
    }
}

class test {
    public static void main(String[] args) {
        System.out.println("G. POOJA PRIYANKA,24107,CSE-B");
        Car car = new Car("Honda", "City", 2023, "Petrol");
        Truck truck = new Truck("Ashok Leyland", "Boss", 2022, "Diesel");
        Motorcycle bike = new Motorcycle("TVS", "Apache", 2024, "Petrol");

        car.displayDetails();
        System.out.println("Car Fuel Efficiency: " + car.calculateFuelEfficiency() + " km/l");
        System.out.println("Distance with 10L fuel: " + car.calculateDistance(10) + " km");
        System.out.println("Max Speed: " + car.getMaxSpeed() + " km/h");

        truck.displayDetails();
        System.out.println("Truck Fuel Efficiency: " + truck.calculateFuelEfficiency() + " km/l");
        System.out.println("Distance with 10L fuel: " + truck.calculateDistance(10) + " km");
        System.out.println("Max Speed: " + truck.getMaxSpeed() + " km/h");

        bike.displayDetails();
        System.out.println("Bike Fuel Efficiency: " + bike.calculateFuelEfficiency() + " km/l");
        System.out.println("Distance with 10L fuel: " + bike.calculateDistance(10) + " km");
        System.out.println("Max Speed: " + bike.getMaxSpeed() + " km/h");
    }
}
