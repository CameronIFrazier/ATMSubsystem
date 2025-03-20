package ATMSubsystem;

public class TransferTransaction extends Transaction {

    private final String sourceAccountId;
    private final String destinationAccountId;

    public TransferTransaction(int accountId, long timestamp, double amount, int status, String source, String destination) {
        super(accountId, TransactionType.TRANSFER, timestamp, amount, status);
        this.sourceAccountId = source;
        this.destinationAccountId = destination;
    }

    public TransferTransaction(int transactionId, int accountId, long timestamp, double amount, int status, String source, String destination) {
        super(transactionId, accountId, TransactionType.TRANSFER, timestamp, amount, status);
        this.sourceAccountId = source;
        this.destinationAccountId = destination;
    }

    public String getSourceAccountId() {
        return this.sourceAccountId;
    }

    public String getDestinationAccountId() {
        return this.destinationAccountId;
    }

}
