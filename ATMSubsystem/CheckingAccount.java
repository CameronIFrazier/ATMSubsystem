package ATMSubsystem;

public class CheckingAccount extends Account {
    private Card debitCard;
    private double overdraftLimit;

    public CheckingAccount(int id, double balance, long createDate, int status, Card debitCard, double overdraftLimit) {
        super(id, balance, createDate, status);
        this.debitCard = debitCard;
        this.overdraftLimit = overdraftLimit;
    }

    public void setDebitCard(Card card) {
        this.debitCard = card;
    }

    public Card getDebitCard() {
        return this.debitCard;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return this.overdraftLimit;
    }
    
}
