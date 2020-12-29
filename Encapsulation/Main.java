package Encapsulation;

public class Main {
    public static void main(String[] args) {
        BankCustomer customer = new BankCustomer(
                "1234567",
                "Ramazan",
                "Mugla" );

        System.out.println(customer.getAccountID());
        System.out.println(customer.getName());
        System.out.println(customer.getAddress());
    }
}
