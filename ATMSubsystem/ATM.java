package ATMSubsystem;

public class ATM {
    private int machineId;
    private String location;
    private boolean status;
    private double cashBalance;
    private double MAX_BALANCE = 100_000;
    private Bank bank;
    private Session currentSession;

    public ATM(int id, String location, double balance, boolean status, Bank bank) {
        this.machineId = id;
        this.location = location;
        this.status = status;
        this.cashBalance = balance;
        this.currentSession = null;
        this.bank = bank;
    }

    public void displayMenu() {
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Transfer");
        System.out.println("4. Check Balance");
    }

    public void processWithdrawl(int amount) {
        // Check if the session customer has enough balance and the ATM has enough cash
        // If true, proceed with the transaction
    }

    public void processDeposit(int amount) {
        // Check if the ATM has enough room for the cash
        // If true, proceed with the transaction
    }

    public void transfer(int amount, int accountNumber) {
        // Check if the session customer has enough balance
        // If true, proceed with the transaction
    }

    public void checkBalance() {
        // Display the balance of the session customer
    }

    public void authenticateUser(int accountNumber, int pinCode) {
        // Check if the account number and pin code are valid
        // If true, start a new session
    }
}
