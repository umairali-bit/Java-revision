package dev.bank;

/*
create a BankCustomer class that has a customer name, a customer id, and a List of accounts.
Create a couple of instances of bank customers, confirming that you can't change a customer's data at all, after it's initialized.
Create a subclass of the bank customer and confirm that the subclass can't tamper with the customer's data as well.

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankCustomer {

    private static int lastCustomerId = 10_000_000;

    private final String name;

    private final int customerId;

    private final List<BankAccount> accounts = new ArrayList<>();

    public BankCustomer(String name, double checkingAmount, double savingsAmount) {
        this.name = name;
        this.customerId = lastCustomerId++;
        accounts.add(new BankAccount(BankAccount.AccountType.CHECKING, checkingAmount)); //adding a new BankAccount, a checking account with the passed checkingAmount
        accounts.add(new BankAccount(BankAccount.AccountType.SAVING, savingsAmount));//adding a new BankAccount, a savings account with the passed savings amount
    }

    public String getName() {
        return name;
    }

    public List<BankAccount> getAccounts() {
        return new ArrayList<>(accounts);
    }

    @Override
    public String toString() {

        /*
        Including all the accounts in the String -> accountsString[] with the same size as accounts list
        Populating each elements in the accountsString array with the String representation of each account
        by using Arrays.setAll(), get the account using lambda expression index and return the String value
        of the element at that index. returning a formatted String with customer name and customerID and accountsStrings

         */

        String[] accountStrings = new String[accounts.size()];
        Arrays.setAll(accountStrings, i-> accounts.get(i).toString());
        return "Customer: %s (id:%015d)%n\t%s%n".formatted(name, customerId, String.join("\n\t", accountStrings));
    }
}
