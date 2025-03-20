package ATMSubsystem;

import java.util.Date;

public class Card {
    public int cardNumber;
    public int pin;
    public int status;
    public Date expiryDate;

    public Card(int cardNumber, int pin, int status, Date expiryDate) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.status = status;
        this.expiryDate = expiryDate;
    }

    public int getCardNumber() {
        return this.cardNumber;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getPin() {
        return this.pin;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return this.status;
    }

    public Date getExpiryDate() {
        return this.expiryDate;
    }
}
