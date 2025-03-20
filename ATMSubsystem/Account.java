package ATMSubsystem;

import java.util.Date;

public class Account {
    private int accountId;
    private double balance;
    private Date createDate;
    private int status;
    private Bank bank;

    public Account(int id, double balance, int status, Bank bank) {
        this.accountId = id;
        this.balance = balance;
        this.createDate = null; // Set the create date to the current date
        this.status = status;
        this.bank = bank;
    }

    public int getId() {
        return this.accountId;
    }

    public double getBalance() {
        return this.balance;
    }

    public double checkBalance() {
        return this.balance;
    }

    public double deposit(double amount) {
        this.balance += amount;
        return this.balance;
    }

    public double withdraw(double amount) {
        this.balance -= amount;
        return this.balance;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void depositAmount(double amount) {
        // Deposit the amount into the account
    }

    public void withdrawAmount(double amount) {
        // Withdraw the amount from the account
    }

    public void transferAmount(double amount, int accountNumber) {
        // Transfer the amount to the account number
    }

    
}
