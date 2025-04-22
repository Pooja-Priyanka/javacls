/* Write a Java program to create a class called Employee with methods called work () and getSalary().
 Create a subclass called HRManager that overrides the work () method and adds a new method called addEmployee(). */

public class employee {
    // Method to simulate work
    public void work() {
        System.out.println("employee is working.");
    }

    // Method to get salary
    public double getSalary() {
        return 75000.0;
    }
}

// Subclass that extends Employee
class HRManager extends employee {
    // Overriding the work method
    @Override
    public void work() {
        System.out.println("HR Manager is working.");
    }

    // New method specific to HRManager
    public void addEmployee() {
        System.out.println("HR Manager is adding a new employee.");
    }
}

// Main class to test the program
class Person {
    public static void main(String[] args) {
        System.out.println("G.POOJA PRIYANKA,24107,CSE-B");
        // Create an Employee object
        employee emp = new employee();
        emp.work();
        System.out.println("Salary:" + emp.getSalary());
        // Create an HRManager object
        HRManager hr = new HRManager();
        hr.work();            // Overridden method
        System.out.println("Salary:" + hr.getSalary()); // Inherited method
        hr.addEmployee();     // New method
    }
}
