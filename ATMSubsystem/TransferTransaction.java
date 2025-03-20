package ATMSubsystem;

public class TransferTransaction extends Transaction {

    private final String sourceAccountId;
    private final String destinationAccountId;

    
    public TransferTransaction(String accountId, long timestamp, double amount, int status, String source, String destination) {
        super(accountId, TransactionType.TRANSFER, timestamp, amount, status);
        this.sourceAccountId = source;
        this.destinationAccountId = destination;
    }

    public TransferTransaction(int transactionId, String accountId, long timestamp, double amount, int status, String source, String destination) {
        super(transactionId, accountId, TransactionType.TRANSFER, timestamp, amount, status);
        this.sourceAccountId = source;
        this.destinationAccountId = destination;
    }
}
