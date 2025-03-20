package ATMSubsystem;

import java.util.List;

public class Customer {
    private int customerId;
    private String name;
    private String address;
    private String phone;
    private String email;
    private List<Account> accounts;

    public Customer(int id, String name, String address, String phone, String email, List<Account> accounts) {
        this.customerId = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.accounts = accounts;
    }

    public int getId() {
        return this.customerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void addAccount(Account account) {
        // Add the account to the customer's list of accounts
    }

    public void deleteAccount() {
        // Delete the account from the customer's list of accounts
    }

    public List<Account> listAccounts() {
        // Display all accounts associated with the customer
        return this.accounts;
    }

    
}
