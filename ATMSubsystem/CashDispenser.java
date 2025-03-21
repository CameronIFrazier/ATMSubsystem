package ATMSubsystem;

public class CashDispenser {

    // Mimics the hardware controller for the ATM's cash dispenser.

    private ATM atm;

    public CashDispenser(ATM atm) {
        this.atm = atm;
    }
    
    public void dispenseCash(double amount) {
        // Instruct the hardware to dispense the cash amount requested.
    }

    public void closeDispenser() {
        // Instruct the hardware to close the cash dispenser.
    }

}
