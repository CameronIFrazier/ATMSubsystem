package atm_sub_system.ATMSubsystem; // changed 

public class Launcher {
    
    public static void main(String[] args) {

        // Define the bank branch details where the ATM is located
        Bank bank = new Bank(1, "3400 Poly Vista, Pomona, CA 91768");

        // Create an ATM object and start the ATM
        // ATM ID will be pulled from a config file in the future.
        ATM atm = new ATM(100, bank);
        atm.start();
    }

}
