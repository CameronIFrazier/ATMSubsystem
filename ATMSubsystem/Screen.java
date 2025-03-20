package ATMSubsystem;

public class Screen {

    // Mimicks the hardware controller for the ATM's screen.
    
    public void displayMessage(String message) {
        System.out.print(message);
    }

    public void displayMessageLine(String message) {
        System.out.println(message);
    }

    public void displayDollarAmount(double amount) {
        System.out.printf("$%,.2f", amount);
    }

}
