package atm_sub_system.ATMSubsystem; // changed 

public class ATM {
    private int atmId;

    private double cashBalance;
    protected final double MAX_CASH_BALANCE = 100_000;

    private Bank bank;
    private Session currentSession;
    private CardReader cardReader;
    private CashDispenser cashDispenser;
    private CashReader cashReader;
    private Keypad keypad;
    private Screen screen;
    private Printer printer;

    public ATM(int atmId, Bank bank) {
        this.atmId = atmId;
        this.bank = bank;
        this.cashBalance = 0; // Fetch current cash balance at initialization from bank database using ATM ID
        this.currentSession = null;
        this.cardReader = new CardReader();
        this.cashDispenser = new CashDispenser(this);
        this.cashReader = new CashReader(this);
        this.keypad = new Keypad();
        this.screen = new Screen();
        this.printer = new Printer();
    }

    public void credit(double amount) {
        // Update central bank database with the amount deposited
        this.cashBalance += amount;
    }

    public void debit(double amount) {
        // Update central bank database with the amount withdrawn
        this.cashBalance -= amount;
    }

    public void start() {
        while(true) {
            // ATM is running
            // Wait for a customer to insert a card
            Card insertedCard = cardReader.readCard();
            if(insertedCard != null) {
                // Card is inserted
                // Start a new session
                currentSession = new Session();
                int pin = keypad.requestPIN();
                // Authenticate the card
                if(currentSession.startSession(insertedCard.getCardNumber(), pin)) {
                    // Card is authenticated

                    // Prompt customer to select account from the list of accounts associated with the card
                    Account selection = null;
                    currentSession.setAccount(selection);
                    
                    // Begin handling transactions for the session account
                    handleSessionTransactions();
                }
                // End the session
                currentSession = null;
            }
        }
    }

    public void handleSessionTransactions() {
        LOOP: while(true) {
            int selection = keypad.getInput();
            switch(selection) {
                case 1:
                    // Withdrawal
                    processWithdrawal();
                    break;
                case 2:
                    // Deposit
                    processDeposit();
                    break;
                case 3:
                    // Transfer
                    processTransfer();
                    break;
                case 4:
                    // Balance inquiry
                    processBalanceInquiry();
                    break;
                case 5:
                    // Exit
                    break LOOP;
                default:
                    System.out.println("Invalid selection. Please try again.");
                    break;
            }
        }
    }

    public void processWithdrawal() {
        // Process the withdrawal transaction

        // Prompt user for the amount to withdraw
        // Check if session account has sufficient balance
        // Check if ATM has sufficient cash
        // If both conditions are met, dispense cash and update account balance
        // If not, display an error message
    }

    public void processDeposit() {
        // Process the deposit transaction

        // Prompt user to input cash
        // Call CashReader to accept cash input
        // Update account balance
    }

    public void processTransfer() {
        // Process the transfer transaction

        // Prompt user for the account number to transfer to
        // Prompt user for the amount to transfer
        // Check if session account has sufficient balance
        // If so, transfer the amount to the target account
        // If not, display an error message
    }

    public void processBalanceInquiry() {
        // Process the balance inquiry transaction

        // Display the account balance for the session account
    }

}
