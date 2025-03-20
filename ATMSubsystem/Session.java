package ATMSubsystem;

public class Session {
    private int sessionId;
    private boolean active;
    private long startTime;
    private double MAX_LIFESPAN = 2_700; // Set a max session lifespan of 45 minutes
    private Customer customer;
    private Account account;

    public Session() {
        this.sessionId = 0; // Generate random session ID
        this.active = false;
        this.customer = null;
        this.account = null;
    }

    public int getId() {
        return this.sessionId;
    }

    public boolean startSession(int cardNumber, int pinCode) {
        // Query the bank database to validate if the card number and PIN are correct
        // If so, start the session and set the start time
        // Fetch the relevant customer information, initialize the customer object, and store metadata in memory
        // Return true if the session was successfully authenticated and started, otherwise return false
        return false;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return this.account;
    }

    public boolean isActive() {
        // Check if the session is still active or has timed out
        return this.active;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void endSession(int amount) {
        // End the session and log out the customer
    }
}
