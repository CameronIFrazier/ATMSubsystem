package ATMSubsystem;

import java.util.Scanner;

public class Keypad {

    // Mimics the hardware controller for the ATM's keypad.
    
    public static Scanner scanner;

    public Keypad() {
        scanner = new Scanner(System.in);
    }
    
    public int requestPIN() {
        System.out.print("Please enter your PIN: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public int getInput() {
        return scanner.nextInt();
    }

}
