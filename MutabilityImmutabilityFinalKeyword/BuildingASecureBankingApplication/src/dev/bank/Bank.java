package dev.bank;

/*

Bank class with a final routing number and the last transactionId initialized with 1
A collection for customer. We are able to find a customer by the customerId. The keyType is a String, which
is the 15-digit customerId and a value BankCustomer. A constructor with just a routingNumber with the initiated customers
map. getCustomer() is fetching the customer by id. Moreover, adding customer to the customers map. A boolean method doTrasaction()
which will let us know that the transaction was successfully processed.

 */

import java.util.HashMap;
import java.util.Map;

public class Bank {


    public final int routingNumber;
    private long lastTransactionId = 1;
    private final Map<String, BankCustomer> customers;


    public Bank(int routingNumber) {
        this.routingNumber = routingNumber;
        customers = new HashMap<>();
    }

    public BankCustomer getCustomer (String id) {

        BankCustomer customer = customers.get(id);
        return customer;
    }

    public void addCustomer(String name, double checkingInitialDeposit, double savingsInitialDeposit) {

        BankCustomer customer = new BankCustomer(name, checkingInitialDeposit, savingsInitialDeposit);
        customers.put(customer.getCustomerId(),customer);

    }

    public boolean doTransaction(String id, BankAccount.AccountType accountType, double amount) {


        BankCustomer customer = customers.get(id);
        if (customer != null) {
            BankAccount account = customer.getAccount(accountType);
            if (account != null) {
                if ((account.getBalance() + amount) < 0) {
                    System.out.println("Insufficient funds");
                } else {
                    account.commitTransaction(routingNumber, lastTransactionId++, id, amount);

                    return true;
                }
            }

        } else {
            System.out.println("Invalid customer id");

        }

        return false;
    }


}
