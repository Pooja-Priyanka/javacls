/* Consider a software system for a company that manages its employees.
The company categorizes its employees into two primary types: RegularEmployee and Manager.
Both types of employees share common attributes such as name and employee ID, but managers have   attributes such as a bonus.
 You are tasked with designing the Java classes for this scenario and add up the salary for each type. */

class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //details of Employee
    public void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

// Manager class 
class Manager extends Employee {
    double bonus;

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    // Override
    @Override
    public void displayDetails() {
        double totalSalary = salary + bonus;
        System.out.println("Name: " + name + ", ID: " + id + ", Salary with Bonus: " + totalSalary);
    }
}

public class Job {
    public static void main(String[] args) {
        System.out.println("G.POOJA PRIYANKA,24107,CSE-B");
        Employee emp1 = new Employee("Priya", 1, 50000.0);
        emp1.displayDetails();  

        Manager emp2 = new Manager("Sai", 2, 60000.0, 10000.0);
        emp2.displayDetails();  
    }
}
