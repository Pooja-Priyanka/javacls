class BankAccount { 
    protected String accountNumber; 
    protected double balance; 
    public BankAccount(String accountNumber) { 
        this.accountNumber = accountNumber; 
        this.balance = 0.0;  
    } 
 
     
    public void deposit(double amount) { 
        if (amount > 0) { 
            balance += amount; 
            System.out.println("Deposited: $" + amount); 
        } else { 
            System.out.println("Deposit amount must be positive."); 
        } 
    } 
 
    public void withdraw(double amount) { 
        if (amount > 0 && amount <= balance) { 
            balance -= amount; 
            System.out.println("Withdrew: rupees" + amount); 
        } else { 
            System.out.println("Insufficient funds or invalid amount."); 
        } 
    } 
 
     
    public double getBalance() { 
        return balance; 
    } 
} 
 
class SavingsAccount extends BankAccount { 
    private static final double WITHDRAWAL_LIMIT = 500.0;  
    private static final double WITHDRAWAL_FEE = 2.0;  
 
    public SavingsAccount(String accountNumber) { 
        super(accountNumber); 
    } 
 
    @Override 
    public void withdraw(double amount) { 
        if (amount > WITHDRAWAL_LIMIT) { 
            System.out.println("Withdrawal amount exceeds the limit of $" + 
WITHDRAWAL_LIMIT); 
        } else { 
            super.withdraw(amount + WITHDRAWAL_FEE);  
        } 
    } 
} 
 
class CheckingAccount extends BankAccount { 
    private static final double WITHDRAWAL_LIMIT = 1000.0;  
    private static final double WITHDRAWAL_FEE = 1.0;  
 
    public CheckingAccount(String accountNumber) { 
        super(accountNumber); 
    } 
 
    @Override 
    public void withdraw(double amount) { 
        if (amount > WITHDRAWAL_LIMIT) { 
            System.out.println("Withdrawal amount exceeds the limit of $" + 
WITHDRAWAL_LIMIT); 
        } else { 
            super.withdraw(amount + WITHDRAWAL_FEE); // Include fee in withdrawal 
        } 
    } 
} 
 
class Main2{ 
    public static void main(String[] args) { 
        System.out.println("G.POOJA PRIYANKA,24107,CSE-B"); 
        SavingsAccount savings = new SavingsAccount("Tony123"); 
        savings.deposit(10000); 
        savings.withdraw(500);  
        savings.withdraw(800);  
        System.out.println("Savings Account Balance: $" + savings.getBalance()); 
        CheckingAccount checking = new CheckingAccount("CA12345"); 
        checking.deposit(18000); 
        checking.withdraw(1000);  
        checking.withdraw(1400);  
        System.out.println("Checking Account Balance: $" + checking.getBalance()); 
    } 
} 
 
