/* Write a Java program that creates a class hierarchy for employees of a company. The base class should be Employee, with subclasses Manager, Developer, and Programmer. Each subclass should have properties such as name, address, salary, and job title. Implement methods for calculating bonuses, generating performance reports, and managing projects.*/

abstract class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public abstract double calculateBonus();

    public void generatePerformanceReport() {
        System.out.println("Performance Report for: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + calculateBonus());
    }

    public void manageProject(String projectName) {
        System.out.println(name + " is managing the project: " + projectName);
    }
}

class Manager extends Employee {
    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    public double calculateBonus() {
        return salary * 0.20;
    }

    @Override
    public void manageProject(String projectName) {
        System.out.println(name + " (Manager) is overseeing the project: " + projectName);
    }
}

class Developer extends Employee {
    public Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    public double calculateBonus() {
        return salary * 0.15;
    }

    @Override
    public void manageProject(String projectName) {
        System.out.println(name + " (Developer) is working on the project: " + projectName);
    }
}

class Programmer extends Employee {
    public Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    public double calculateBonus() {
        return salary * 0.10;
    }

    @Override
    public void manageProject(String projectName) {
        System.out.println(name + " (Programmer) is coding for the project: " + projectName);
    }
}

public class company {
    public static void main(String[] args) {
	System.out.println("G.POOJA PRIYANKA,24107,CSE-B");
        Employee manager = new Manager("sai", "123 Main St", 90000);
        Employee developer = new Developer("sree", "456 Oak Rd", 75000);
        Employee programmer = new Programmer("sam", "789 Pine Rd", 60000);

        manager.generatePerformanceReport();
        developer.generatePerformanceReport();
        programmer.generatePerformanceReport();

        manager.manageProject("NextGen CRM");
        developer.manageProject("NextGen CRM");
        programmer.manageProject("NextGen CRM");
    }
}
