package ATMSubsystem;

public class Transaction {
    
    public enum TransactionType {
        WITHDRAWAL, DEPOSIT, TRANSFER
    }

    private final int transactionId;
    private final int accountId;
    private final long timestamp;
    private final double amount;
    private final TransactionType type; // Possible types WITHDRAWAL, DEPOSIT, TRANSFER
    private int status;

    public Transaction(int accountId, TransactionType type, long timestamp, double amount, int status) {
        // New transaction
        this.transactionId = 0; // Generate a unique transaction ID
        this.accountId = accountId;
        this.timestamp = timestamp;
        this.amount = amount;
        this.type = type;
        this.status = status;
        // Insert new transaction into bank database
    }

    public Transaction(int transactionId, int accountId, TransactionType type, long timestamp, double amount, int status) {
        // Existing transaction
        this.transactionId = transactionId;
        this.accountId = accountId;
        this.timestamp = timestamp;
        this.amount = amount;
        this.type = type;
        this.status = status;
    }

    public int getTransactionId() {
        return this.transactionId;
    }

    public int getAccountId() {
        return this.accountId;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public TransactionType getType() {
        return this.type;
    }

    public int getStatus() {
        return this.status;
    }   
}
