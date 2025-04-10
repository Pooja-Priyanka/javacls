/* create a class named back account with methods deposit and withdraw where the deposit method should accepts a parameter and when this method is called the deposited amount should be added to the current balance in addition to that when a with draw method is called it has to verify whether the withdraw amount is less-than the current balance if not displaying a message saying that there are insufficient funds. 
use the constructor to display the details of the costumer (name,account number, IFSC,branch) atleast 2 costumers as objects c1, c2. */

public class bank {
    // Attributes
    String name;
	String accountNumber;
    String ifsc;
	String branch;
    double currentBalance;

    // Constructor to initialize customer details
    bank(String name, String accountNumber, String ifsc, String branch, double currentBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.ifsc = ifsc;
        this.branch = branch;
        this.currentBalance = currentBalance;
        System.out.println("Account created for " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("IFSC Code: " + ifsc);
        System.out.println("Branch: " + branch);
        System.out.println("current Balance: " + currentBalance);
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            currentBalance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("New Balance: " + currentBalance);
        } 
        else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= currentBalance) {
            currentBalance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + currentBalance);
        } 
        else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("IFSC Code: " + ifsc);
        System.out.println("Branch: " + branch);
        System.out.println("Current Balance: " + currentBalance);
    }

    public static void main(String[] args) {
        // Creating c1
        bank c1 = new bank("pooja", "123456789", "IFSC1", "Branch1", 5000.0);
        c1.deposit(2000.0);
        c1.withdraw(3000.0);
        c1.withdraw(5000.0);  

        // Creating c2
        bank c2 = new bank("priyanka", "987654321", "IFSC2", "Branch2", 10000.0);
        c2.deposit(5000.0);
        c2.withdraw(7000.0);
        c2.withdraw(9000.0); 
    }
}
