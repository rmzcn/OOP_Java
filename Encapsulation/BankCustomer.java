package Encapsulation;

public class BankCustomer {
    private String accountID;
    private String name;
    private String address;

    public BankCustomer(String accountID, String name, String address) {
        this.accountID = accountID;
        this.name = name;
        this.address = address;
    }

    public String getAccountID() {
        return accountID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
