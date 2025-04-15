package atm_sub_system.ATMSubsystem; // changed 


public class Account {
    private int accountId;
    private double balance;
    private long createDate;
    private int status;

    public Account(int id, double balance, long createDate, int status) {
        this.accountId = id;
        this.balance = balance;
        this.createDate = createDate;
        this.status = status;
    }

    public int getId() {
        return this.accountId;
    }

    public long getCreateDate() {
        return this.createDate;
    }

    public double getBalance() {
        return this.balance;
    }

    public double deposit(double amount) {
        this.balance += amount; // Update the balance locally
        // Make call to the central bank database to update the balance in the database
        return this.balance;
    }

    public double withdraw(double amount) {
        this.balance -= amount; // Update the balance locally
        // Make call to the central bank database to update the balance in the database
        return this.balance;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    
}
