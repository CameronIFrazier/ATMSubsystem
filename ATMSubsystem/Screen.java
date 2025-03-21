package ATMSubsystem;

public class Screen {

    // Mimicks the hardware controller for the ATM's screen.
    
    public static void displayMessage(String message) {
        System.out.print(message);
    }

    public static void displayMessageLine(String message) {
        System.out.println(message);
    }

    public static void displayDollarAmount(double amount) {
        System.out.printf("$%,.2f", amount);
    }

}
