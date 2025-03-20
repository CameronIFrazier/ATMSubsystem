package ATMSubsystem;

public class SavingsAccount extends Account {
    private double interestRate;
    private double withdrawalLimit;

    public SavingsAccount(int id, double balance, int status, Bank bank, double interestRate, double withdrawalLimit) {
        super(id, balance, status, bank);
        this.interestRate = interestRate;
        this.withdrawalLimit = withdrawalLimit;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public void setWithdrawalLimit(double withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    public double getWithdrawalLimit() {
        return this.withdrawalLimit;
    }
}
