package Assgn1;

// Abstract Account class
abstract class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("---------------------------");
    }
}

// SavingsAccount class
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        double interest = amount * interestRate / 100;
        setBalance(getBalance() + amount + interest);
        System.out.println("Deposited " + amount + " with interest of " + interest + " in Savings Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn " + amount + " from Savings Account.");
        } else {
            System.out.println("Insufficient balance in Savings Account.");
        }
    }
}

// CurrentAccount class
class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposited " + amount + " in Current Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn " + amount + " from Current Account.");
        } else {
            System.out.println("Withdrawal exceeds overdraft limit in Current Account.");
        }
    }
}

public class Q8 { // Banking App like SBI Yono App.

    public static void main(String[] args) {

        // Creating instances of Savings and Current Accounts
        Account savings = new SavingsAccount("SA123", 5000, 5);
        Account current = new CurrentAccount("CA456", 2000, 1000);

        // Performing transactions
        savings.deposit(1000);
        savings.withdraw(2000);
        savings.displayAccountDetails();

        current.deposit(500);
        current.withdraw(2500);
        current.displayAccountDetails();

    }
}
