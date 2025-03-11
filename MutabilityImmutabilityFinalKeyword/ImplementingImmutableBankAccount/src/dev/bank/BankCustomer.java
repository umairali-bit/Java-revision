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

    private final int getLastCustomerId;

    private final List<BankAccount> accounts = new ArrayList<>();

    





}
