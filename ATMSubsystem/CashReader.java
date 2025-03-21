package ATMSubsystem;

public class CashReader {
    
    // Mimics the hardware controller for the ATM's cash reader.

    private ATM atm;

    public CashReader(ATM atm) {
        this.atm = atm;
    }

    public double acceptCash() {
        // Instruct the hardware to loop and accept cash input from the customer.
        // Identify the bills inserted and calculate the total amount.
        // Return the total amount inserted.
        return 0.0;
    }

    public void closeCashReader() {
        // Instruct the hardware to close the cash reader.
    }

}
