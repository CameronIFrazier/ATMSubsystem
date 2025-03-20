package ATMSubsystem;

public class Session {
    private int sessionId;
    private boolean active;
    private double MAX_LIFESPAN = 1_800; // Set a max session lifespan of 30 minutes
    private Account account;
    private Customer customer;

    public Session() {
        this.sessionId = 0; // Generate a unique session ID
        this.active = false;
        this.account = null;
        this.customer = null;
    }

    public int getID() {
        return this.sessionId;
    }

    public boolean isActive() {
        return this.active;
    }

    public Account getAccount() {
        return this.account;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void login(int accountNumber, int pinCode) {
        // Check if the account number and pin code are valid
        // If true, retrieve the relevant account and customer information and start the session
    }

    public void endSession(int amount) {
        // End the session and log out the customer
    }
}
