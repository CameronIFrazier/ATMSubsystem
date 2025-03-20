package ATMSubsystem;

public class CheckingAccount extends Account {
    private Card debitCard;
    private double overdraftLimit;

    public CheckingAccount(int id, double balance, int status, Bank bank, Card debitCard, double overdraftLimit) {
        super(id, balance, status, bank);
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
