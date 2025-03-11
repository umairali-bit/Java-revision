package dev.bank;

/*
create a BankCustomer class that has a customer name, a customer id, and a List of accounts.
Create a couple of instances of bank customers, confirming that you can't change a customer's data at all, after it's initialized.
Create a subclass of the bank customer and confirm that the subclass can't tamper with the customer's data as well.

 */

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {

    private static int lastCustomerId = 10_000_000;

    private final String name;

    private final int customerId;

    private final List<BankAccount> accounts = new ArrayList<>();

    public BankCustomer(String name, double checkingAmount, double savingsAmount) {
        this.name = name;
        this.customerId = lastCustomerId++;
        accounts.add(new BankAccount(BankAccount.Account.CHECKING, checkingAmount)); //adding a new BankAccount, a checking account with the passed checkingAmount
        accounts.add(new BankAccount(BankAccount.Account.SAVING, savingsAmount));//adding a new BankAccount, a savings account with the passed savings amount
    }
}
