package ATMSubsystem;

public class BankManagement {
    private Bank bank;
    private Regulator regulator;
    String empolyeeID;
    String position;

    public BankManagement(Bank bank, Regulator regulator) {
        this.bank = bank;
        this.regulator = regulator;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Bank getBank() {
        return this.bank;
    }

    public void setRegulator(Regulator regulator) {
        this.regulator = regulator;
    }

    public Regulator getRegulator() {
        return this.regulator;
    }

    public void setEmpolyeeID(String empolyeeID) {
        this.empolyeeID = empolyeeID;
    }

    public String getEmpolyeeID() {
        return this.empolyeeID;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return this.position;
    }

    public void generateReport() {
        //implement
    }

    public voud monitorATMStatus() {
        //implement
    }

    public void addBank(Bank bank) {
        //implement
    }

    public void removeBank(Bank bank) {
        //implement
    }

    public void addRegulator(Regulator regulator) {
        //implement
    }

    public void removeRegulator(Regulator regulator) {
        //implement
    }
}