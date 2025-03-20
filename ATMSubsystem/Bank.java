package ATMSubsystem;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    public int bankId;
    public String name;
    public String location;
    public List<Account> accounts;

    public Bank(int id, String name, String location) {
        this.bankId = id;
        this.name = name;
        this.location = location;
        this.accounts = new ArrayList<>();
    }

    public int getID() {
        return this.bankId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return this.location;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public void removeAccount(Account account) {
        this.accounts.remove(account);
    }

    public List<Account> getAccounts() {
        return this.accounts;
    }
}
