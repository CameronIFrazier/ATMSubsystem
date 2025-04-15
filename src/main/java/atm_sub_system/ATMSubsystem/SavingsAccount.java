package atm_sub_system.ATMSubsystem; // changed 

public class SavingsAccount extends Account {
    private double interestRate;
    private double withdrawalLimit;

    public SavingsAccount(int id, double balance, long createDate, int status, double interestRate, double withdrawalLimit) {
        super(id, balance, createDate, status);
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
