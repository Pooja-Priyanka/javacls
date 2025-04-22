import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    double getBalance();
    String getAccountType();
}

class SavingsAccount implements Account {
    private double balance;
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate / 100;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String getAccountType() {
        return "Savings Account";
    }
}

class CurrentAccount implements Account {
    private double balance;

    public CurrentAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    @Override
    public double calculateInterest() {
        
        return 0;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String getAccountType() {
        return "Current Account";
    }
}

class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added. Total accounts: " + accounts.size());
    }

    public void showBalances() {
        for (Account account : accounts) {
            System.out.println(account.getAccountType() + " Balance: " + account.getBalance());
        }
    }
}

class question26 {
    public static void main(String[] args) {
        System.out.println("NAME:K.Sai Yaswanth,ROLL NO: 24144,SEC:CSE-B");

        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        
        System.out.print("Enter initial balance for Savings Account: ");
        double savingsInitialBalance = scanner.nextDouble();
        System.out.print("Enter interest rate for Savings Account: ");
        double interestRate = scanner.nextDouble();
        SavingsAccount savingsAccount = new SavingsAccount(savingsInitialBalance, interestRate);

        System.out.print("Enter initial balance for Current Account: ");
        double currentInitialBalance = scanner.nextDouble();
        CurrentAccount currentAccount = new CurrentAccount(currentInitialBalance);

    
        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        
        savingsAccount.deposit(50000);
        savingsAccount.withdraw(2500);
        System.out.println("Interest earned on Savings Account: " + savingsAccount.calculateInterest());
        currentAccount.deposit(3000);
        currentAccount.withdraw(1000);
        bank.showBalances();

        scanner.close();
    }
}